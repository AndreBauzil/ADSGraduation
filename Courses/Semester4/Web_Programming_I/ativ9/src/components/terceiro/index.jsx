import React, { useState } from 'react';


export const Terceiro = () => {
    // estado
    const [numero, setNumero] = useState(10);

    // funções
    const addNumero = () => setNumero(numero+10)

    return (
        <>
        <p>{ numero }</p>
        <div>
            <button onClick={ addNumero }>Somar</button>
            <button onClick={() => setNumero(10)}>↻</button>
        </div>
        </>
    )
};