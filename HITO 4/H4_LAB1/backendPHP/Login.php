<?php
$conexion = mysqli_connect("localhost", "root", "", "android_db");

$username = $_POST["usuario"];
$password = $_POST["contrasena"];

if (!$conexion) {
    echo "Error en la conexión a la base de datos: " . mysqli_connect_error();
    exit;
}

echo "Conexión a la base de datos establecida correctamente.";

$sql = "SELECT * FROM usuarios WHERE usuario='$username' AND contrasena='$password'";
$result = mysqli_query($conexion, $sql);

if (!$result) {
    echo "Error en la consulta: " . mysqli_error($conexion);
    exit;
}

if ($result->num_rows > 0) {
    echo "Ingresaste correctamente";
} else {
    echo "Usuario o contraseña incorrectos";
}
?>
