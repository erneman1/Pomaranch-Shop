Vue.component('header-temp', {
    template: '<header>' +
        '    <div class="container head">' +
        '        <a href="/index.html"><img src="img/logo.png" alt="logo" class="logo"></a>' +
        '        <nav class="navigation">' +
        '            <ul class="navigation_list">' +
        '                <li class="navigation_item"><a href="/index.html">Главная</a></li>' +
        '                <li class="navigation_item"><a href="/shop.html">Магазин</a></li>' +
        '                <li class="navigation_item"><a href="#">Размеры</a></li>' +
        '                <li class="navigation_item"><a href="#">О нас</a></li>' +
        '                <li class="navigation_item"><a href="#">Контакты</a></li>' +
        '                <li class="navigation_item cart">' +
        '                    <a href="#"><img src="icons/cart_icon.png" alt="cart"></a>' +
        '                    <div class="count">5</div>' +
        '                </li>' +
        '            </ul>' +
        '        </nav>' +
        '' +
        '    </div>' +
        '</header>'
});
headerVue = new Vue({
    el: '#header',
    template: '<header-temp />'
});

Vue.component('footer-comp', {
    template:
        '<footer>' +
        '<div class="container sect">' +
        '        <div class="left">' +
        '            <ul class="footer_list">' +
        '                <li class="footer_list_item">Нужна помощ?</li>' +
        '                <li class="footer_list_item"><a href="/">Связаться с нами</a></li>' +
        '                <li class="footer_list_item"><a href="/">FAQs</a></li>' +
        '                <li class="footer_list_item"><a href="/">Уход за изделием</a></li>' +
        '            </ul>' +
        '        </div>' +
        '        <div class="right">' +
        '            <ul class="footer_list">' +
        '                <li class="footer_list_item">Часы работы:</li>' +
        '                <li class="footer_list_item">10:00 - 21:00</li>' +
        '            </ul>' +
        '        </div>' +
        '    </div>' +
        '</footer>'
})
footerVue = new Vue({
    el: '#footer',
    template: '<footer-comp/>'
})

