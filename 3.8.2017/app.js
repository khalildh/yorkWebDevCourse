function hello() {
	console.log("Hello World!");
}

hello();


var btn = document.getElementById('btn')

var bool = 0;

btn.addEventListener("click", function(){
	if (bool === 0) {
		document.getElementById("hello").innerHTML = "Hello World!!!";
		$("#hello").removeClass("colorBlue colorRed")
		$("#hello").addClass("colorRed");
		console.log($("#hello"))
`1

		bool += 1
	} else if (bool === 1) {
		document.getElementById("hello").innerHTML = "Goodbye World!!!"
		$("#hello").removeClass("colorBlue colorRed")
		$("#hello").addClass("colorBlue");
		bool -= 1
	}
})