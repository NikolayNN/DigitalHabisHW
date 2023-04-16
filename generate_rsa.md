Генерация самоподписанного сертификата с использованием keytool
Для генерации самоподписанного сертификата с алгоритмом ключа RSA и CN=ИмяФамилия O=DigitalHabits с использованием утилиты keytool из JDK необходимо выполнить следующие шаги:

1. Создание нового keystore:
   keytool -genkeypair -alias mycert -keyalg RSA -keysize 2048 -dname "CN=ИмяФамилия,O=DigitalHabits" -validity 365 -keystore mykeystore.jks
   В результате выполнения этой команды будет создан новый keystore (mykeystore.jks), в котором будет сгенерирован самоподписанный сертификат с алгоритмом ключа RSA, установленным сроком действия 365 дней и CN=ИмяФамилия O=DigitalHabits.

2. Экспорт сертификата в файл:
   keytool -export -alias mycert -file mycert.cer -keystore mykeystore.jks
   В результате выполнения этой команды сертификат будет экспортирован в файл mycert.cer.

3. Импорт сертификата в дефолтный keystore:
   keytool -import -alias mycert -file mycert.cer -keystore $JAVA_HOME/jre/lib/security/cacerts
   В результате выполнения этой команды сертификат будет импортирован в дефолтный keystore джавы (cacerts) под алиасом mycert.

пароль по умолчанию changeit

После выполнения этих шагов вы получите самоподписанный сертификат (mycert.cer), который можно использовать для тестирования и локальной разработки.