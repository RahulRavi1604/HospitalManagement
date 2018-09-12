$("#button").click(function(){
$.ajax({
async: false,
cache: false,
type: "GET",
url: "displayUsers",
success: function (html) {
    $('#success').html(html);
}
});
});


