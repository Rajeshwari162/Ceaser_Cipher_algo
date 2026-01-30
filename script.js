function caesarCipher(text, shift) {
    shift = shift % 26;
    let result = "";

    for (let i = 0; i < text.length; i++) {
        let code = text.charCodeAt(i);

        if (code >= 65 && code <= 90) {
            result += String.fromCharCode(
                (code - 65 + shift + 26) % 26 + 65
            );
        }
        else if (code >= 97 && code <= 122) {
            result += String.fromCharCode(
                (code - 97 + shift + 26) % 26 + 97
            );
        }
        else {
            result += text[i];
        }
    }
    return result;
}

function encrypt() {
    const text = document.getElementById("text").value;
    const shift = Number(document.getElementById("shift").value);
    document.getElementById("result").innerText =
        caesarCipher(text, shift);
}

function decrypt() {
    const text = document.getElementById("text").value;
    const shift = Number(document.getElementById("shift").value);
    document.getElementById("result").innerText =
        caesarCipher(text, -shift);
}

