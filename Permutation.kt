class Permutation {


    fun <T> permutation(arr: List<T>): MutableList<MutableList<T>>{
        var temp_perm = mutableListOf<MutableList<T>>()
       if(arr.size == 1)
           return mutableListOf(mutableListOf(arr[0]))
        for ( i in arr.indices){
            var temp_arr = arr.toMutableList()
            var temp_elem = temp_arr.removeAt(i)
            var perm = permutation(temp_arr)
            perm.forEach { it.add(temp_elem) }
            temp_perm.addAll(perm)
        }
        return temp_perm
    }



    companion object Main {
        @JvmStatic
        fun main(args: Array<String>) {
            var test = listOf(1,2,3,4,5)
            var res = Permutation().permutation(test)
            print(res.toTypedArray().contentDeepToString())
        }
    }
}