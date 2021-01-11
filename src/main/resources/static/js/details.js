let id = new URLSearchParams(location.search).get('id');

$('document').ready(function () {
    loadItem();
})

$('#add_btn').on('click', addToCart);
$('#buy_btn').on('click', addToOrder);

function loadItem() {

    $.getJSON('/products/' + id, data => {
        $('.name').text(data.name);
        $('.vendor').text('Артикул: 00' + data.id);
        $('.price').text('Цена: ' + new Intl.NumberFormat('ru-RU', {
            minimumSignificantDigits: 3,
            style: 'currency',
            currency: 'USD'
        }).format(data.price));
        $('.description').text(data.description);
        $('.image').attr('src', data.picturePath);
        checkCart();
    })
}

function addToCart() {

    let size = $('#size option:checked').val();

    let quantity = Number($('#quantity').val());
    if (cart[id] !== undefined) {

        if (cart[id][size] !== undefined) {
            cart[id][size] += quantity;
        } else {
            cart[id][size] = quantity;
        }
    } else {
        cart[id] = {
            [size] : quantity
        }
    }
    writeToLS();
    updateCart();
    console.log(JSON.stringify(cart));
}

function addToOrder() {
    object = {
        
    }
    $.post('/products/update', );
}