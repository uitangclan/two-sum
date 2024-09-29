fun main (){
    val nums = intArrayOf(3,2,4)
    val target = 6
    println(twoSum(nums, target).contentToString())
}

fun twoSum(nums: IntArray, target: Int):IntArray {
    var map = HashMap<Int, Int> ()
    for (i in nums.indices ) {
        var x = target - nums[i]
        if (map.containsKey(x)) {
            return intArrayOf(map.get(x)!!, i)
        }
        map.put(nums[i], i)
    }
    return nums.clone()
}