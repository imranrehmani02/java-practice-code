function add()
{
	var a=parseInt(prompt("enter first no."));
	var b=parseInt(prompt("enter second no."));
	var add=a+b;
	document.write("<h1 style='color:red'> Addition is "+add+"</h1>");
}

function sub()
{
	var a=parseInt(prompt("enter first no."));
	var b=parseInt(prompt("enter second no."));
	var sub=a-b;
	document.write("<h1 style='color:blue'> Substraction is "+sub+"</h1>");	
}

function mul()
{
	var a=parseInt(prompt("enter first no."));
	var b=parseInt(prompt("enter second no."));
	var mul=a*b;
	document.write("<h1 style='color:green'> Multipication is "+mul+"</h1>");		
}

function div()
{
	var a=parseInt(prompt("enter first no."));
	var b=parseInt(prompt("enter second no."));
	var div=a/b;
	document.write("<h1 style='color:purple'> Division is "+div+"</h1>");			
}