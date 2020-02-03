$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8182/hello"
    }).then(function(data) {
        let v = data;
        $(".hello").text($(".hello").text() + v );
    });
});