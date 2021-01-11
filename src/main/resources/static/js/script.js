let cart = {};
let cartCounter = $('.count');

$('document').ready(function () {
    updateCart();
});

$('.lookBtn').click(function () {
    location.replace('/shop');
});

function checkCart() {
    if (localStorage.getItem('cart') != null) {
        cart = JSON.parse(localStorage.getItem('cart'));
    }
}

function updateCart(){
    checkCart();
    cartCounter.text(Object.keys(cart).length);
}

function writeToLS() {
    localStorage.setItem('cart', JSON.stringify(cart));
}