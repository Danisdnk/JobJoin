// Call the dataTables jQuery plugin
$(document).ready(function() {
    //on ready
});

async function registrarUsuarios(){

    let datos = {};
    datos.nombre = document.getElementById('txtNombre').value;
    datos.apellido = document.getElementById('txtApellido').value;
    datos.email = document.getElementById('txtEmail').value;
    //datos.telefono = document.getElementById('txtTelefono').value;
    datos.password = document.getElementById('txtPassword').value;
    //datos.fechaNacimiento = document.getElementById('txtNacimiento').value;

    let repetirPassword = document.getElementById('txtRepetirPassword').value;
    if(repetirPassword != datos.password){
        alert('La contraseña que escribiste es diferente.');
        return;
    }

    const request = await fetch('http://localhost:63342/JobJoin/static/pages/sign-up.html', {
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(datos)
    });

    alert("La cuenta fue creada con exito!")
    window.location.href = 'dashboard.html'

    console.log(request);
}