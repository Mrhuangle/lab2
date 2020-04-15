$(document).ready(function() {
    $("#search").click(function(){
        if($(":text").val() != "") {
            var id = $(":text").val();
            $.ajax({
                type: "get",
                contentType : "application/json;charsetset=UTF-8",
                url: "http://localhost:8080/task/" + id,
                success: function (response) {
                    console.log(response);
                    let data = response;
                    $(".id").text("ID:" + data.id);
                    $(".message").text("Message:" + data.message);
                }

            });
        }
    });
});
