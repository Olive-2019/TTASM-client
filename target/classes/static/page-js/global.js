function get_url_values(){
    var ret=[],hash;
    var hashes=window.location.href.slice(window.location.href.indexOf('?') + 1).split('&');
    for(var i=0;i<hashes.length;i++){
        hash=hashes[i].split('=');
        ret.push(hash[0]);
        ret[hash[0]]=hash[1];
    }
    return ret
}

function get_nap(){
    var url = "http://localhost:8882/";
    return url;
}
function getCrossFieldNap() {
    return "http://localhost:63342/client/static/";
}