window.onload=function init(){
    var href=window.location.href;
    if(href.includes("username=")){
        var div=document.getElementById("login-page");
        div.setAttribute("style","display:none");
    }
};


function login() {

    var username=document.getElementById("username").value;

    var href=window.location.href;
    var new_href;
    if(href.includes("?")){
        new_href=href+"&username="+username;
    }
    else{
        new_href=href+"?username="+username;
    }
    window.location=new_href;
}

function check_login(destination) {
    var href=window.location.href;
    if(href.includes("username=")===false){
        alert("请先登录");
        return false;
    }
    var args=get_url_values();
    username=args["username"];
    href=getCrossFieldNap() +destination + "?username="+username;
    window.location=href;
    return true;
}