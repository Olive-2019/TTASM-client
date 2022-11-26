
window.onload = function init() {
    show_stations();
};

function showData() {
    var url = get_nap() + "CheckTrainNumber/selectByStartingStationAndEndingStation";
    var data = {
        'startingStation' : document.getElementById('startingStation').value,
        'endingStation' : document.getElementById('endingStation').value
    };
    $.ajax({
        type: "get",
        url: url,
        async: false,
        data : data,
        success: function(data){
            console.log(data);
            var table = document.getElementById('trainNumberTable');
            for (var i = 0; i < data.length; ++i) {
                var tr = document.createElement('tr');
                tr.setAttribute('class', "odd gradeX");
                table.appendChild(tr);

                var hash = ['trainNumber', 'trainId', 'startingTime', 'startingStation', 'endingStation', 'price'];
                for (var j = 0; j < hash.length; ++j) {
                    var td = document.createElement('td');
                    td.innerHTML = data[i][hash[j]];
                    tr.appendChild(td);
                }


                var modify_td  = document.createElement('td');
                var modify_button = document.createElement('input');
                modify_button.setAttribute('type','button');
                modify_button.setAttribute('value','选座');
                var modify_onclick = "(function (){getSeat(\'" + data[i]['trainNumber'] + "\')})()";
                modify_button.setAttribute('onclick', modify_onclick);
                modify_button.setAttribute("class", "btn btn-primary");
                modify_td.appendChild(modify_button);
                tr.appendChild(modify_td);
            }
        },
        error: function (error) {
            alert(JSON.stringify(error));
        }
    });
}
function getSeat(trainNumber) {
    var url = get_nap() + "ManageTicket/selectForSaleByTrainNumber";
    var data = {
        "trainNumber" : trainNumber
    };
    $.ajax({
        type: "get",
        url: url,
        async: false,
        data : data,
        success: function(data){
            var seatList = document.getElementById('seat');
            seatList.innerHTML = "";
            // alert(data);
            console.log(data);
            for (var i = 0; i < data.length; ++i) {
                var seat = data[i];
                var option = document.createElement('option');
                option.setAttribute("value", seat['seat']);
                option.innerHTML = seat['seat'];
                seatList.appendChild(option);
            }
        },
        error: function (error) {
            alert(JSON.stringify(error));
        }
    });
}

function buyTicket(ticketID) {
    var url = get_nap() + "ManageTicket/buyTicket";
    var data = {
        "ticketID" : ticketID
    };
    $.ajax({
        type: "get",
        url: url,
        async: false,
        data : data,
        success: function(data){
            window.location = getCrossFieldNap() + "left.html";
        },
        error: function (error) {
            alert(JSON.stringify(error));
        }
    });
}

function show_stations(){
    var url=get_nap() + "CheckTrainNumber/get_all_stations";
    $.ajax({
        type: "get",
        url: url,
        async: false,
        data: {},
        success: function(data){
            //data=JSON.stringify(data);
            var dataList1=document.getElementById("startingStationList");
            var dataList2=document.getElementById("endingStationList");
            var option_example=document.createElement("option")
            var option_num=data.length;
            //alert(JSON.parse(data))
            for(var i=0;i<option_num;i++){
                info=data[i];
                //alert(info);
                option1=option_example.cloneNode(true);
                option1.innerText=info.station_name;
                option2=option_example.cloneNode(true);
                option2.innerText=info.station_name;
                dataList1.append(option1);
                dataList2.append(option2);
            }
        },
        error: function (error) {
            alert(JSON.stringify(error));
        }
    });

}

function buy_ticket(){
    var args=get_url_values();
    username=args["username"];
    var ticket_id=document.getElementById("seat").value;
    var url = get_nap() + "ManageTicket/checkTicket";
    var data = {
        "ticketID" : ticketID
    };
    $.ajax({
        type: "get",
        url: url,
        async: false,
        data : data,
        success: function(data){
            if(data!=="for sale"){
                alert("改票已被抢购");
                var href= window.location.href;
                window.location=href;
                return false;
            }
        },
        error: function (error) {
            alert(JSON.stringify(error));
        }
    });

    var href=getCrossFieldNap()+"pay.html?username="+username+"&ticket_id="+ticket_id;
    window.location=href;
    return true;
}
