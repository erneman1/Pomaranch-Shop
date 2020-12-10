//Hamburger scrypt
window.addEventListener('DOMContentLoaded', () => {
    const menu = document.querySelector('.menu'),
        menuItem = document.querySelectorAll('.menu_item'),
        hamburger = document.querySelector('.hamburger');

    if (hamburger) {
        hamburger.addEventListener('click', () => {
            hamburger.classList.toggle('hamburger_active');
            menu.classList.toggle('menu_active');
        });
    }


    menuItem.forEach(item => {
        item.addEventListener('click', () => {
            hamburger.classList.toggle('hamburger_active');
            menu.classList.toggle('menu_active');
        })
    })
})

//Index page Buttons
const toShopBtn = document.querySelector("#toShopBtn");
if (toShopBtn) {
    toShopBtn.onclick = function () {
        window.location = '/shop';
    }
}

//Shop page scrypt

function openList(id) {
    const element = document.getElementById(id);
    const elementHeader = element.querySelector('.category_header');
    const list = element.querySelector('.filters_body');
    const plus = element.querySelector('.plus');
    if (list.style.display == null) {
        list.style.display = 'none'
    }

    elementHeader.onclick = () => {
        console.log("Hello");
        if (list.getAttribute('style.display') === 'none') {
            list.setAttribute('style.display', 'block');
        } else {

        }
    }
}