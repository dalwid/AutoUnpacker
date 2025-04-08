<h1 align="center" >
    <br>AutoUnpacker<br><br> 
    <img src="/doc-image/AutoUnpacker-image.png" width="750" height="500">
</h1>

 [![Generic badge](https://img.shields.io/badge/<PRIMEIRAVERSAO>-<1.0>-<COLOR>.svg)](https://shields.io/) [![Maintenance](https://img.shields.io/badge/Maintained%3F-yes-green.svg)](https://GitHub.com/Naereen/StrapDown.js/graphs/commit-activity) [![GitHub license](https://img.shields.io/github/license/Naereen/StrapDown.js.svg)](https://github.com/Naereen/StrapDown.js/blob/master/LICENSE)



<p>
Eu estava cansado de toda hora ir no https://start.spring.io/
criar meu projeto spring boot e ao baixar o arquivo.
</p>

<p>
Sempre tinha que desenpacotar então decidir criar esse pequeno app para desenpacotar automaticamente
</p>

<p>
Fiz de forma que funcione tanto no Unbunto como no Windows afinal java é também é pra isso.
</p>

### Indice
- [Como Funciona](#-Como-Funciona)
- [Usando Auto Unpacker](#-Utilizado-o-AutoUnpacker)
- [ATENÇÃO](#-🚨🚨🚨-Tenha-cuidado-🚨🚨🚨)

<h2 align="center">Como Funciona?</h2>
<p>
O AutoUnpacker funciona da seguinte maneira: ao ser ativado vc digita o caminho da pasta que sera pedido. Ele ficará monitorando e todo arquivo zipado que for jogado nele será desempacotado o arquivo zipado ou, tar, ou gz não será excluido.
</p>
<p>Veja a imagem a baixo</p>
<img src="/doc-image/pedindo o caminh e pasta a ser monitoradoII.png">

<p style="padding: 10px; margin: 20px; font-size: 1.3rem;">Digitando o caminho e a pasta a ser monitorado</p>
<img src="/doc-image/digitando o caminho e a pasta no windowsII.png">

<p style="padding: 10px; margin: 20px; font-size: 1.3rem;">Digitando o caminho e a pasta a ser monitorado no Ubuntu/linux/OS/MEC</p>
<img src="/doc-image/digitando o caminho e a pasta no ubuntu-linuxII.png">

<p style="padding: 10px; margin: 20px; font-size: 1.3rem;">Após isso arraste o arquivo a ser desempacotado na pasta que esta sendo monitorada como na imagem abaixo</p>
<img src="/doc-image/arrastando par pasta monitorada afim de descompactar.png">

<p style="padding: 10px; margin: 20px; font-size: 1.3rem;">A pós isso você recebera uma mensagem da seguinte maneira:</p>
<img src="/doc-image/arquivo detectado e desempacotadoII.png">

<p style="padding: 10px; margin: 20px; font-size: 1.3rem;">Ao receber essa mensagem quer dizer que ao mesmo tempo o arquivo foi desempacotado</p>
<img src="/doc-image/Arquivo desempacotado com sucesso.png">

<hr>

<h2 align="center">Utilizado o AutoUnpacker</h2>
<p style="padding: 2px; margin: 5px; font-size: 1.3rem;">Vá aqui mesmo nesse projeto ou a baixe o mesmo</p>
<p style="padding: 2px; margin: 5px; font-size: 1.3rem;">Adentre na pasta out/artifacts/autodesempacotador_jar</p>
<p style="padding: 2px; margin: 5px; font-size: 1.3rem;">
Dentro desta pasta está O autodesempacotador.
salve em qualquer lugar que você desejar
</p>
<p style="padding: 2px; margin: 5px; font-size: 1.3rem;">Depois vai na pasta que vc salvou o autodesempacotador e faça o seguinte</p>

##### No terminal (Windows, Linux ou macOS)
```bash
$ java -jar AutoUnpacker.jar
```

##### No windows
```bash
$ java -jar AutoUnpacker.jar X:\caminho\pasta_monitorada
```

##### No Linux ou macOS
```bash
$ java -jar AutoUnpacker.jar /home/user/Desketop/pasta_a_ser_monitorada
```
##### Pronto agora vc pode usar a vontade

<hr>

<h2 align="center" style="color:red">🚨🚨🚨 Tenha cuidado 🚨🚨🚨</h2>

### Não usar em produção e nem fazer deploy, pois tem vunanerabilídade é para usar somente em seu ambiente local.

### O arquivo que tiver algum tipo de uso cusarará erro e não funcionará, logo isso será resolvido.

<h3 style="color: blue;">  Extenções como: .Tar, .GZ, .RAR Ainda serão implementados, pois tive problemas com os mesmos</h3>

<hr>

## 🔨 Tools

<svg xmlns="http://www.w3.org/2000/svg" width="100" height="100" fill="none" viewBox="0 0 256 256"><rect width="256" height="256" fill="#242938" rx="60"/><path fill="#fff" d="M101.634 182.619C101.634 182.619 93.9548 187.293 106.979 188.63C122.707 190.634 131.023 190.299 148.386 186.962C148.386 186.962 153.06 189.971 159.406 192.306C120.331 209.002 70.9089 191.304 101.634 182.619ZM96.6252 160.914C96.6252 160.914 88.2753 167.26 101.299 168.593C118.327 170.262 131.69 170.597 154.732 165.926C154.732 165.926 157.741 169.267 162.747 170.936C115.664 184.961 62.8975 172.269 96.6252 160.917V160.914ZM188.795 198.984C188.795 198.984 194.471 203.658 182.449 207.334C160.073 214.012 88.6104 216.019 68.5735 207.334C61.564 204.325 74.9197 199.982 79.2587 199.319C83.6012 198.317 85.9366 198.317 85.9366 198.317C78.2569 192.973 34.8424 209.337 63.8959 214.046C143.709 227.073 209.499 208.37 188.792 199.018L188.795 198.984ZM105.307 138.203C105.307 138.203 68.9052 146.888 92.2793 149.89C102.298 151.223 122 150.892 140.368 149.555C155.396 148.221 170.458 145.548 170.458 145.548C170.458 145.548 165.113 147.886 161.441 150.222C124.342 159.915 53.2107 155.573 73.5827 145.554C90.9526 137.204 105.307 138.203 105.307 138.203V138.203ZM170.423 174.604C207.83 155.234 190.46 136.534 178.438 138.873C175.429 139.54 174.096 140.207 174.096 140.207C174.096 140.207 175.097 138.203 177.436 137.54C201.145 129.19 219.849 162.586 169.757 175.61C169.757 175.61 170.092 175.275 170.423 174.608V174.604ZM108.979 227.364C145.046 229.703 200.147 226.03 201.484 208.995C201.484 208.995 198.817 215.673 171.764 220.683C141.042 226.359 102.968 225.692 80.5957 222.016C80.5957 222.016 85.2698 226.023 108.982 227.36L108.979 227.364Z"/><path fill="#F58219" d="M147.685 28C147.685 28 168.389 49.0388 127.983 80.7594C95.5891 106.472 120.632 121.168 127.983 137.861C108.948 120.833 95.2609 105.802 104.606 91.7762C118.331 71.0828 156.062 61.0644 147.685 28ZM137 123.842C146.683 134.862 134.333 144.881 134.333 144.881C134.333 144.881 159.044 132.195 147.692 116.494C137.338 101.466 129.324 94.1184 172.738 69.0689C172.738 69.0689 104.278 86.0968 137.007 123.835L137 123.842Z"/></svg>

<svg xmlns="http://www.w3.org/2000/svg" width="100" height="100" fill="none" viewBox="0 0 256 256"><rect width="256" height="256" fill="#242938" rx="60"/><path fill="url(#paint0_linear_159_762)" d="M78.5714 184L30.2856 145.714L54.2856 101.143L123.143 128L78.5714 184Z"/><path fill="url(#paint1_linear_159_762)" d="M228 81.4285L224.286 197.143L147.429 228L101.143 198.286L168.857 128L139.143 63.1428L165.714 31.1428L228 81.4285Z"/><path fill="url(#paint2_linear_159_762)" d="M228 81.4285L167.143 153.429L139.143 63.1428L165.714 31.1428L228 81.4285Z"/><path fill="url(#paint3_linear_159_762)" d="M124.286 194L44 223.143L56.8571 178L73.7143 122.571L28 107.143L56.8571 28L119.714 35.7143L181.429 106.286L124.286 194Z"/><path fill="#000" d="M190.571 66.5715H67.1428V190H190.571V66.5715Z"/><path fill="#fff" d="M124.857 166.857H78.5713V174.571H124.857V166.857Z"/><path fill="#fff" d="M112 92.0001V82.5715H86.2856V92.0001H93.7142V124.286H86.2856V133.714H112V124.286H104.857V92.0001H112Z"/><path fill="#fff" d="M136.571 134.572C132.571 134.572 129.143 133.714 126.571 132.286C124 130.857 121.714 128.857 120 126.857L127.143 118.857C128.571 120.572 130 121.714 131.429 122.572C132.857 123.429 134.571 124 136.286 124C138.286 124 140 123.429 141.429 122C142.571 120.572 143.143 118.572 143.143 115.429V82.5715H154.571V116C154.571 119.143 154.286 121.714 153.429 124C152.571 126.286 151.429 128 149.714 129.714C148.286 131.143 146.286 132.572 144 133.143C141.714 134 139.429 134.572 136.571 134.572Z"/><defs><linearGradient id="paint0_linear_159_762" x1="30.256" x2="123.192" y1="142.541" y2="142.541" gradientUnits="userSpaceOnUse"><stop offset=".258" stop-color="#F97A12"/><stop offset=".459" stop-color="#B07B58"/><stop offset=".724" stop-color="#577BAE"/><stop offset=".91" stop-color="#1E7CE5"/><stop offset="1" stop-color="#087CFA"/></linearGradient><linearGradient id="paint1_linear_159_762" x1="101.621" x2="254.926" y1="99.086" y2="183.914" gradientUnits="userSpaceOnUse"><stop stop-color="#F97A12"/><stop offset=".072" stop-color="#CB7A3E"/><stop offset=".154" stop-color="#9E7B6A"/><stop offset=".242" stop-color="#757B91"/><stop offset=".334" stop-color="#537BB1"/><stop offset=".432" stop-color="#387CCC"/><stop offset=".538" stop-color="#237CE0"/><stop offset=".655" stop-color="#147CEF"/><stop offset=".792" stop-color="#0B7CF7"/><stop offset="1" stop-color="#087CFA"/></linearGradient><linearGradient id="paint2_linear_159_762" x1="208.651" x2="165.972" y1="150.615" y2="23.088" gradientUnits="userSpaceOnUse"><stop stop-color="#FE315D"/><stop offset=".078" stop-color="#CB417E"/><stop offset=".16" stop-color="#9E4E9B"/><stop offset=".247" stop-color="#755BB4"/><stop offset=".339" stop-color="#5365CA"/><stop offset=".436" stop-color="#386DDB"/><stop offset=".541" stop-color="#2374E9"/><stop offset=".658" stop-color="#1478F3"/><stop offset=".794" stop-color="#0B7BF8"/><stop offset="1" stop-color="#087CFA"/></linearGradient><linearGradient id="paint3_linear_159_762" x1="58.63" x2="186.639" y1="75.066" y2="286.8" gradientUnits="userSpaceOnUse"><stop stop-color="#FE315D"/><stop offset=".04" stop-color="#F63462"/><stop offset=".104" stop-color="#DF3A71"/><stop offset=".167" stop-color="#C24383"/><stop offset=".291" stop-color="#AD4A91"/><stop offset=".55" stop-color="#755BB4"/><stop offset=".917" stop-color="#1D76ED"/><stop offset="1" stop-color="#087CFA"/></linearGradient></defs></svg>
