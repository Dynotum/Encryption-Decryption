# Encryption-Decryption

# Stage #4: I command you in

Description

Modify the previous program to work with command-line arguments instead of the standard input. The program must parse three arguments: -mode, -key and -data. The first argument should determine the program’s mode (enc - encryption, dec - decryption). The second argument is an integer key to modify the message, and the third argument is a text or ciphertext within quotes to encrypt or decrypt.

All the arguments are guaranteed to be passed to the program. If for some reason it turns out to be wrong:

    If there is no -mode, the program should work in enc mode.
        If there is no -key, the program should consider that key = 0.
	    If there is no -data, the program should assume that the data is an empty string.

	    Keep in mind that arguments may be in different order. For example, -mode enc may be at the end, at the beginning or in the middle of arguments array.

	    Run configuration examples for encryption

	    java Main -mode enc -key 5 -data "Welcome to hyperskill!"

	    Encryption output example

	    \jqhtrj%yt%m~ujwxpnqq&

	    Run configuration examples for decryption

	    java Main -key 5 -data "\jqhtrj%yt%m~ujwxpnqq&" -mode dec

	    Decryption output example

	    Welcome to hyperskill!

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

In this project, you will learn how to encrypt and decrypt messages and texts using simple algorithms. We should note that such algorithms are not suitable for industrial use because they can easily be cracked, but these algorithms demonstrate some general ideas about encryption.

Description

For the first stage, you need to manually encrypt the message "we found a treasure!" and print only the ciphertext (in lower case).
To encrypt the message, replace each letter with the letter that is in the corresponding position from the end of the English alphabet (a→z, b→y, c→x, ... x→c, y →b, z→a). Do not replace spaces or the exclamation mark.

Use the given template to your program to print the ciphertext instead of the original message.

The output should look like ## ##### # ########! where # is a lower-case English letter.
