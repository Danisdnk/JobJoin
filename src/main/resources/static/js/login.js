// Call the dataTables jQuery plugin
$(document).ready(function() {
    //on ready
});

async function iniciarSesion(){

    let datos = {};
    datos.email = document.getElementById('txtEmail').value;
    datos.password = document.getElementById('txtPassword').value;

    const request = await fetch('http://localhost:63342/JobJoin/static/pages/sign-in.html', {
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(datos)
    });
    const respuesta = await request.text();

    if(respuesta == 'OK'){
        window.location.href = 'dashboard.html'
    }else{
        alert("Las credenciales son incorrectas. Por favor intente nuevamente.")
    }

    console.log(respuesta);

}