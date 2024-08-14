console.log("Script loaded");

///////////////////Change theme work
let currentTheme = getTheme();

//initialize

document.addEventListener('DOMContentLoaded',() =>{
    changeTheme();
});

// todo
function changeTheme(){
   
   // set to web page
    changeCurrentPageTheme(currentTheme,"")


    // set the listener to change theme  button 
    const changeThemeButton = document.querySelector("#theme_change_button")
 
    changeThemeButton.addEventListener("click",(event) =>{
        let oldTheme = currentTheme;
        console.log("Change Theme button clicked");
        
        if(currentTheme === "dark"){
            //dark theme to light  
            currentTheme="light";

        }else{
            // light theme to dark
                currentTheme="dark"
        }

        changeCurrentPageTheme(currentTheme,oldTheme);
       
    });
    
}

// set theme to localstorage
function setTheme(theme){
    localStorage.setItem("theme",theme);
}

// get theme from local storage
function getTheme(){
 let theme =localStorage.getItem("theme");
 return theme ? theme : "light";
}

// change current page theme
function changeCurrentPageTheme(theme,oldTheme){
    // local storage main update
    setTheme(currentTheme);
    //remove the current theme
    if(oldTheme){
    
    document.querySelector("html").classList.remove(oldTheme);
    }// set the current theme
    document.querySelector("html").classList.add(theme);

    // change text of button
    document.querySelector("#theme_change_button")
    .querySelector("span").textContent = theme == "light" ? "Dark":"Light";
}
/////////////end theme change work