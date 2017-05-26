/* alert("hello") */

var btn = document.getElementById("btn");

var nums = []

for (i = 10; i < 21; i ++) {
	nums.push(i);
}


console.log(nums)


btn.addEventListener("click", function(){
		// alert("hello");
	document.getElementById("hello").innerHTML = nums;

	if (document.getElementById("hello").innerHTML === "10,11,12,13,14,15,16,17,18,19,20") {
		document.getElementById("hello").innerHTML = "Yo Mama"; 
	}
})

btn.addEventListener("click", function(){
		// alert("hello");
	if (document.getElementById("hello").innerHTML === "10,11,12,13,14,15,16,17,18,19,20") {
		document.getElementById("hello").innerHTML = "Yo Mama"; 
	}
})