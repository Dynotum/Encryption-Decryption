# Encryption-Decryption

# Stage #3: Decrypted!

Description

In this stage, you need to support decryption in your program. The decryption is simply the inverse of encryption, following the same steps but reversing the order in which the keys are applied.

Write a program that reads three lines from the standard input: a target operation (enc - encryption, dec - decryption), a message or a cyphertext, and a key to encrypt/decrypt messages. All non-letter characters must be encrypted as well as regular letters. We recommend you to get an integer representation of each character (according to the Unicode table) to shift it.

Decompose your program using methods to make it easy to understand and edit later. One method should encrypt a message and another one should decrypt it according to a key.

Encryption input example

enc
Welcome to hyperskill!
5
Encryption output example

\jqhtrj%yt%m~ujwxpnqq&
Decryption input example

dec
\jqhtrj%yt%m~ujwxpnqq&
5
Decryption output example

Welcome to hyperskill!

# Stage #2: Knowledge is key

Write a program that reads an English message and an integer number (key) from the standard input and shifts each letter by the specified number according to its order in the alphabet. If you reach the end of the alphabet, start back at the beginning (a follows z).

The English alphabet is below:

abcdefghijklmnopqrstuvwxyz
The program should not modify non-letter characters.

The key is assumed to mean that if a person knows the value of the key, he or she will be able to decrypt the text, and if he or she does not know, he or she will not be able to decrypt the text. It's like a real key that can open up access to the message text.

Note, key is just a special parameter that controls the behavior of our encryption algorithm. See the picture below for more information.

The encryption process

Input example
welcome to hyperskill
5

Output example
bjqhtrj yt mdujwxpnqq1

# Stage #1: Encrypted!
Motivation

Today, encryption and decryption algorithms are used everywhere on the Internet to protect our data. This is especially important for sites that handle sensitive data, such as e-commerce sites that accept online card payments and login areas that require users to enter their credentials. To ensure data security, there are complex encryption algorithms behind the scenes.

In this project, you will learn how to message and decrypt messages and texts using simple algorithms. We should note that such algorithms are not suitable for industrial use because they can easily be cracked, but these algorithms demonstrate some general ideas about encryption.

Description

For the first stage, you need to manually message the message "we found a treasure!" and print only the ciphertext (in lower case).
To message the message, replace each letter with the letter that is in the corresponding position from the end of the English alphabet (a→z, b→y, c→x, ... x→c, y →b, z→a). Do not replace spaces or the exclamation mark.

Use the given template to your program to print the ciphertext instead of the original message.

The output should look like ## ##### # ########! where # is a lower-case English letter.
