$(document).ready(function() {
    // on ready
 });
 
 
async function registrarAsegurado() {
   let datos = {};
   datos.nombres = document.getElementById('nombres').value;
   datos.apellidos= document.getElementById('apellidos').value;
   datos.correo = document.getElementById('correo').value;
   datos.telefono = document.getElementById('telefono').value;
   datos.dni = document.getElementById('dni').value;
   datos.direccion = document.getElementById('direccion').value;
   datos.contrasena = document.getElementById('contrasena').value;
   
   let repetirContrasena = document.getElementById('contrasena2').value;

   if(datos.nombres != "" && datos.apellidos != "" && datos.correo != "" && datos.telefono != "" && datos.dni != "" && datos.direccion != "" && datos.contrasena != "" && datos.contrasena2 != ""){
    if(datos.contrasena == repetirContrasena){
      window.location.replace("iniciarsesion.html");
      alert("Sus datos fueron procesados con éxito!, proceda a pagar su seguro para terminar el registro en VIDLIFE");
    }
    else{
      alert("Las contraseñas ingresadas son distintas. Tienen que ser iguales para seguir con el registro");
      return;
    }
   }
   else{
        alert("Complete todos los campos por favor");
        return;
   }

  const request = await fetch('api/asegurado', {
     method: 'POST',
     headers: {
       'Accept': 'application/json',
       'Content-Type': 'application/json'
     },
     body: JSON.stringify(datos)
   });
   const usuario = await request.json();

 }
 