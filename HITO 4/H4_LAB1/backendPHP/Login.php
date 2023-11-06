<?php
$conexion = mysqli_connect("localhost", "root", "", "android_db");

if (!$conexion) {
    echo "Error en la conexión a la base de datos: " . mysqli_connect_error();
    exit;
}

echo "Conexión a la base de datos establecida correctamente.";

$username = $_POST["username"];
$password = $_POST["password"];

$sql = "SELECT * FROM usuarios WHERE usuario = ? AND contrasena = ?";
$stmt = mysqli_prepare($conexion, $sql);
mysqli_stmt_bind_param($stmt, "ss", $username, $password);
mysqli_stmt_execute($stmt);

$result = mysqli_stmt_get_result($stmt);

if (!$result) {
    echo "Error en la consulta: " . mysqli_error($conexion);
    exit;
}

if (mysqli_num_rows($result) > 0) {
    echo "Login exitoso";
} else {
    echo "Usuario o contraseña incorrectos";
}

mysqli_stmt_close($stmt);
mysqli_close($conexion);
?>
