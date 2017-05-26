//Use at least one regular JS selector and one jQuery selector.


// Add an event listener to the button so that when it is clicked, the
// 'important' class is toggled on the h1 element.
$("button").click(function(){
    $("h1").toggleClass("important");
});

// Add event listeners to the first paragraph so that when it's hovered over,
// in other words, the mouse is over the element, the class 'first' is added.
// When the mouse leaves the element, remove the class 'first'. 
var p1 = document.getElementById('p1');
p1.addEventListener("mouseenter", function(){
    p1.classList.add("first")
});
p1.addEventListener("mouseleave", function(){
    p1.classList.remove("first")
});

// Add event listeners to the second paragraph so that when it's hovered over,
// in other words, the mouse is over the element, the class 'second' is added.
// When the mouse leaves the element, remove the class 'second'.

var p2 = document.getElementById('p2');
p2.addEventListener("mouseenter", function(){
    p2.classList.add("second")
});
p2.addEventListener("mouseleave", function(){
    p2.classList.remove("second")
});