## Instalación

Descarga e Importa el archivo .jar ya compilado en este repositorio de la carpeta dist a tu proyecto.

## Uso

```java
import CryptographyJava.Crypthography;

public class Example {

    public static void main(String[] args) {

        String input = "1234";

        //Obtener texto en formato SHA-256
        String SHA256 = Crypthography.getSHA256(input);

        //Obtener texto en formato SHA-512
        String SHA512 = Crypthography.getSHA512(input);

        //Obtener texto en formato MD5
        String MD5 = Crypthography.getMD5(input);

        //imprimir el resultado
        System.out.println("SHA256: "+SHA256);
        System.out.println("SHA512: "+SHA512);
        System.out.println("MD5: "+MD5);
    }

}
```

## Salida

```
SHA256: ec476cb32b6f82ece6f68561bab3e6de2a9db2d5d6025791aa78e3aaf09bc61e
SHA512: 91855969966dfa6be9309fd6be88cbf2d26f2b163dd408e5cd7df7d9546bc91ac6ff165b655b421f730d4066fb8447b05b94b1957fb6acb18295995d8d5fa94f
MD5: 3ad1a377100133e5a28b7e24561fe21e

```
