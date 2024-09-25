fun main (){
    val nums = intArrayOf(3,2,4)
    val target = 6
    println(twoSum(nums, target).contentToString())
}

fun twoSum(nums: IntArray, target: Int):IntArray {
    var map = HashMap<Int, Int> ()
    for (i in nums.indices) {
        map.put(nums[i], i)
    }
    for (i in nums.indices) {
        var j = target - nums[i]
        if (map.containsKey(j) && map.get(j) != i) {
            return intArrayOf(i, map.get(j)!!) 
        }
    }
    return nums.clone()
}