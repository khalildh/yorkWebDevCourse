var btn = document.getElementById('btn');

btn.addEventListener("click", function(){
	var width1 = parseInt(document.getElementById("width").value);
	var height1 = parseInt(document.getElementById("height").value);
	var triangle1 = triangle(width1, height1);

	var arrayOne = document.getElementById("array1").value;
	var array1 = [];
	var num = "";
	for (i = 0; i < arrayOne.length; i++) {
		

		num = num + arrayOne[i];

		if (arrayOne[i] === " ") {
			array1.push(parseInt(num));
			num = ""
			
		} else if (i === arrayOne.length -1) {
			array1.push(parseInt(num));
		}

	}

	var average = averageOf(array1);



	var arrayTwo = document.getElementById("array2").value;
	var array2 = [];
	var num = "";
	for (i = 0; i < arrayTwo.length; i++) {
		

		num = num + arrayTwo[i];

		if (arrayTwo[i] === " ") {
			array2.push(parseInt(num));
			num = ""
			
		} else if (i === arrayTwo.length -1) {
			array2.push(parseInt(num));
		}

	}


	mapping(array2);

	document.getElementById("answer1").innerHTML = triangle1;
	document.getElementById('answer2').innerHTML = average;
	document.getElementById("answer3").innerHTML = mapping(array2);
})































function triangle(width, height) {
	return (width * height * .5)
}



var numArray = [2, 4, 5, 10];


function averageOf(array) {

	sum = array.reduce( function(prev, current) {
		return prev + current;
	})

	return sum/array.length;
}






function mapping(array) {
	array = array.map( function(element) {
		return element * 2;
	});

	return array
}

