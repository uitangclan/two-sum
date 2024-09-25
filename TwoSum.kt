fun main (){
    val nums = intArrayOf(2,7,11,15)
    val target = 9
    println(twoSum(nums, target).contentToString())
}

fun twoSum(nums: IntArray, target: Int):IntArray {
    var map = HashMap<Int, Int> ()
    for (i in nums.indices) {
        map.put(nums[i], i)
    }
    for (i in nums.indices) {
        var j = target - nums[i]
        if (map.containsKey(j)) {
            return intArrayOf(i, map.get(j)!!) 
        }
    }
    return nums.clone()
}