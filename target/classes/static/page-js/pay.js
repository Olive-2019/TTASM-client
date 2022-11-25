window.onload = function init() {
    var args=get_url_values();
    var ticket_id=args["ticket_id"];
    var client_name=args["username"];
    var data = {
        "ticket_id" : ticket_id,
        "client_name" : client_name
    };
    var url=get_nap() + "Pay/lock_ticket";
    $.ajax({
        type: "get",
        url: url,
        async: false,
        data: data,
        success: function(data){
        },
        error: function (error) {
            alert(JSON.stringify(error));
        }
    });
};

function pay() {
    var args=get_url_values();
    var ticket_id=args["ticket_id"];
    var client_name=args["username"];

    var data = {
        "ticket_id" : ticket_id,
    };
    var url=get_nap() + "Pay/buy_ticket";

    $.ajax({
        type: "get",
        url: url,
        async: false,
        data: data,
        success: function(data){
            alert("支付成功");
            window.location = getCrossFieldNap() + "CheckTrainNumber.html?username="+client_name;
        },
        error: function (error) {
            alert(JSON.stringify(error));
        }
    });
}

function cancel() {
    var args=get_url_values();
    var ticket_id=args["ticket_id"];
    var client_name=args["username"];

    var data = {
        "ticket_id" : ticket_id,
    };
    var url=get_nap() + "Pay/unlock_ticket";

    $.ajax({
        type: "get",
        url: url,
        async: false,
        data: data,
        success: function(data){
            window.location = getCrossFieldNap() + "CheckTrainNumber.html?username="+client_name;
        },
        error: function (error) {
            alert(JSON.stringify(error));
        }
    });
}