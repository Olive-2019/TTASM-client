
window.onload=function () {
    var args=get_url_values();
    client_name=args["username"];
    var data = {
        "client_name" : client_name
    };
    var url=get_nap() + "Return/get_all_orders";
    $.ajax({
        type: "get",
        url: url,
        async: false,
        data: data,
        success: function(data){
            var dataList=document.getElementById("ticketsList");
            var option_example=document.createElement("option");
            var len=data.length;
            for(var i=0;i<len;i++){
                var option=option_example.cloneNode(true);
                option.innerText=JSON.stringify(data[i]);
                dataList.append(option);
            }
        },
        error: function (error) {
            alert(JSON.stringify(error));
        }
    });
};
function Return() {

}