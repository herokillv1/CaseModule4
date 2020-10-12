document.addEventListener("DOMContentLoaded", function () {
    let menu = document.querySelectorAll('div.menu-navbar');
    let menu1 = document.querySelectorAll('div.back-to-header');
    menu = menu[0];
    menu1 = menu1[0];
    window.addEventListener("scroll", function () {
        if (pageYOffset > 170) {
            menu.style.position = "fixed";
            menu.style.top = "0px";
            menu1.style.display = "block"
        } else {
            menu.style.position = "relative";
            menu.style.top = "0px";
            menu1.style.display = "none"
        }
    })
})