# Information center
## Table of contents
- [Information center](#information-center)
  - [Table of contents](#table-of-contents)
  - [Deskripsi Soal](#deskripsi-soal)
    - [ASCII Art](#ascii-art)
    - [printing ascii](#printing-ascii)
    - [Penilaian terhadap extra mile:](#penilaian-terhadap-extra-mile)
  - [Screen Recording](#screen-recording)
    - [Mac OS](#mac-os)
    - [Linux](#linux)
    - [Windows](#windows)
  - [if you're going to do the extra mile.](#if-youre-going-to-do-the-extra-mile)


---
## Deskripsi Soal
### ASCII Art
tidak suka dengan header yang berada pada atas menu? silahkan ganti sendiri [disini](http://patorjk.com/software/taag/#p=display&f=Graffiti&t=Type%20Something%20)
```
       ,'_ /|         .---.       ,'_ /|
  .--. |  | :        /. ./|  .--. |  | :
,'_ /| :  . |     .-'-. ' |,'_ /| :  . |
|  ' | |  . .    /___/ \: ||  ' | |  . .
|  | ' |  | | .-'.. '   ' .|  | ' |  | |
:  | | :  ' ;/___/ \:     ':  | | :  ' ;
|  ; ' |  | '.   \  ' .\   |  ; ' |  | '
:  | : ;  ; | \   \   ' \ |:  | : ;  ; |
'  :  `--'   \ \   \  |--" '  :  `--'   \
:  ,      .-./  \   \ |    :  ,      .-./
 `--`----'       '---"      `--`----'
```
### printing ascii
head to [printer.java](printer.java), lalu ganti `judul.txt` sesuai dengan file mana yang diperlukan. Isi dari `judul.txt` menyesuaikan dengan ascii text art-nya. Method `header` digunakan untuk membaca sebuah file txt, lalu di print ke dalam terminal.

`printer.java`
```java
import java.io.*;

public class printer {

    public static void main(String[] args) {
        header("judul.txt");
    }
    public static void header(String nama_file_txt){
        File file = new File(nama_file_txt);
        String encoding = "utf-8";
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(file), encoding)) {
            int data = isr.read();
            while (data != -1) {
                System.out.print((char) data);
                data = isr.read();
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
```
judul.txt
```bash
▄█▄    ████▄    ▄     ▄▄▄▄▀ ████▄  ▄  █      ▄▄▄▄▄ ▄   ██▄     ▄   █
█▀ ▀▄  █   █     █ ▀▀▀ █    █   █ █   █    ▄▀  █    █  █  █     █  █
█   ▀  █   █ ██   █    █    █   █ ██▀▀█        █ █   █ █   █ █   █ █
█▄  ▄▀ ▀████ █ █  █   █     ▀████ █   █     ▄ █  █   █ █  █  █   █ ███▄
▀███▀        █  █ █  ▀               █       ▀   █▄ ▄█ ███▀  █▄ ▄█     ▀
             █   ██                 ▀             ▀▀▀         ▀▀▀
```

### Penilaian terhadap extra mile:
- extra mile akan dinilai jika semua kondisi pada Deskripsi Soal sudah **terpenuhi**
- kerjakan salah satu extra mile saja.
  - jika kedua extra mile dikerjakan maka akan dinilai extra mile yang mempunyai implementasi paling tepat, jika keduanya tepat maka akan dihargai dengan respect dan "👍🏾"
  - jika kedua extra mile nya salah, akan diharga usahanya saja

## Screen Recording
### Mac OS
 - press `Shift-Command (⌘)-5` and you're gold.
   - [more info](https://support.apple.com/en-sg/HT208721)
### Linux
Debian (Ubuntu >18.04, elementaryOS >14)
 - press `Ctrl+Alt+Shift+R` and you're gold.

Arch Linux
- install via terminal
  - `yaourt -S peek`
  - `peek`
and you're gold.

### Windows
 - press `⊞ Win + G`
   - Gamebar muncul
   - record.
 - kalau Gamebar tidak muncul alternatifnya bisa
   - [pakai microsoft powerpoint](https://www.youtube.com/watch?v=6T020-TI_3U)
   - [pakai shareX](https://getsharex.com/)

Kalau semuanya tidak bisa, you are welcome to Lab Model to use the computer.


## if you're going to do the extra mile.
- [json format on java using Gson library](https://www.youtube.com/watch?v=VBSkTj2RF3Q)
- [error handling enaena](https://www.youtube.com/watch?v=u0EnKP6SdNM) (indo)