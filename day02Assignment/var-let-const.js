const browserVersion = 'chrome';

function browser(){

    if (browserVersion.startsWith ('chrome')){
        var color = 'RYGB'
        console.log("Validated as Chrome Browser");

    }else{
        console.log("This is Not Chrome Browser");
    }
    console.log("The color is Outside the if block"+" "+ color);
    
}

console.log(`The Browser is `+" "+ browserVersion);
//console.log(`The Broser is from outside the function block ` + browserVersion);

//To call the function
browser();

