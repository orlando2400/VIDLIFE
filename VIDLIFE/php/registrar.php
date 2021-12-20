<?php
$conexion = mysqli_connect("localhost","root","","vidlife");
$nombres = $_POST["nombres"];
$apellidos = $_POST["apellidos"];
$correo = $_POST["correo"];
$telefono = $_POST["telefono"];
$dni = $_POST["dni"];
$direccion = $_POST["direccion"];
$contra = $_POST["contraseña"];
$contra2 = $_POST["contraseña2"];

$insertar = "INSERT INTO asegurados (nombres_aseg, apellidos_aseg, correo_aseg, telef_aseg, dni_aseg, direc_aseg, contra_aseg, contraconf_aseg) VALUES ('$nombres','$apellidos','$correo','$telefono','$dni','$direccion','$contra','$contra2')";

$verificar_dni = mysqli_query($conexion, "SELECT * FROM asegurados WHERE dni_aseg = '$dni'");

if(mysqli_num_rows($verificar_dni)>0){
    echo'
        <script>
            alert("El usuario ya está registrado, inserte otros datos");
            window.location = "../html/registro.html";
        </script>  
    ';
    exit;
}

$resultado = mysqli_query($conexion, $insertar);
/*if($resultado){
     echo'
        <script>
            alert("El usuario ya está registrado, inserte otros datos");
            window.location = "../html/escoger.html";
        </script>  
    ';
}*/
mysqli_close($conexion);
