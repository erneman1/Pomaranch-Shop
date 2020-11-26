window.addEventListener('DOMContentLoaded', () => {
    const menu = document.querySelector('.menu'),
    menuItem = document.querySelectorAll('.menu_item'),
    hamburger = document.querySelector('.hamburger');

    hamburger.addEventListener('click', () => {
        hamburger.classList.toggle('hamburger_active');
        menu.classList.toggle('menu_active');
    });

    menuItem.forEach(item => {
        item.addEventListener('click', () => {
            hamburger.classList.toggle('hamburger_active');
            menu.classList.toggle('menu_active');
        })
    })
})

$(document).ready(function(){
    $('.size_slider').slick({
        prevArrow: '<button type="button" class="slick-prev"><img src="../static/icons/left-arrow.png" th:src="@{icons/left-arrow.png}"/></button>',
        nextArrow: '<button type="button" class="slick-next"><img src="../static/icons/right-arrow.png" th:src="@{icons/right-arrow.png}"/></button>',
    });
  });