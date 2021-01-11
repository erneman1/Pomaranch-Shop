$("document").ready(function () {
    loadGoods();
});

function loadGoods() {
    $.getJSON("products", function (data) {
        let out = '';
        for (let item in data) {
            out += '<div data-id="' + data[item].id + '" class="product_item">';
            out += '<img src="' + data[item].picturePath + '">';
            out += '<div class="name">' + data[item]['name'] + '</div>';
            out += '<div class="price">' + new Intl.NumberFormat('ru-RU', {
                minimumSignificantDigits: 3,
                style: 'currency',
                currency: 'USD'
            })
                .format(data[item]['price']) + '</div>';
            out += '</div>';
        }
        $('.products').html(out);
        $('.product_item').on('click', openDetails)
    });
}

function openDetails() {
    let id = $(this).attr('data-id');
    location.replace('/details?id=' + id);
}

$('.sorting').click(() => {
    $('.sort_list').slideToggle();
});

$('.man').click(() => {
    $(".man_list").slideToggle();
});

$(".woman").click(() => {
    $(".woman_list").slideToggle();
});

$(".kids").click(() => {
    $(".kids_list").slideToggle();
});
    $(".girl").click(() => {
        $(".girls").slideToggle();
    });

$(".boy").click(() => {
    $(".boy").next().slideToggle();
});