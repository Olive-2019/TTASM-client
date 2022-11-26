
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
                var str=JSON.stringify(data[i]);
                str=str.slice(1,str.length-1);
                option.innerText=str;
                dataList.append(option);
            }
        },
        error: function (error) {
            alert(JSON.stringify(error));
        }
    });
};
function Return() {
    var args=get_url_values();

    var str=document.getElementById("tickets").value;
    var ticket_id=str.split(" ")[0];
    var data = {
        "ticket_id" : ticket_id
    };
    var url=get_nap() + "Return/return_ticket";
    $.ajax({
        type: "get",
        url: url,
        async: false,
        data: data,
        success: function(data){
            alert("退票成功")
            var href=window.location.href;
            window.location=href;
        },
        error: function (error) {
            alert(JSON.stringify(error));
        }
    });
}