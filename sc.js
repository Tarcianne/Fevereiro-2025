// Usando a biblioteca Tone.js para gerar os sons
const synth = new Tone.Synth().toDestination();

// Função para tocar o som
function playSound(note) {
    synth.triggerAttackRelease(note, "8n");
}

// Selecionar todas as teclas (botões)
const keys = document.querySelectorAll(".key");

// Adicionar evento de clique aos botões
keys.forEach(key => {
    key.addEventListener("click", () => {
        const note = key.getAttribute("data-note");  // Pega a nota da tecla
        playSound(note);
    });
});

// Mapeamento das teclas do teclado físico
document.addEventListener("keydown", (e) => {
    const keyMapping = {
        "a": "C4",
        "w": "C#4",
        "s": "D4",
        "e": "D#4",
        "d": "E4",
        "f": "F4",
        "t": "F#4",
        "g": "G4",
        "y": "G#4",
        "h": "A4",
        "j": "B4",
        "k": "C5",
        "l": "D5"
    };

    const note = keyMapping[e.key];
    if (note) {
        playSound(note);
    }
});

