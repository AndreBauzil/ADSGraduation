import React, { useState } from 'react';
import { Button, Form, Input, Inputs, Label, Video } from "./style";
let click=0;
    
export const Quarto = () => {
    // estados
    const [email, setEmail] = useState('');
    const [senha, setSenha] = useState('');
    const [mensagem, setMensagem] = useState('');
    const [dicas, setDicas] = useState('')

    // variáveis
    const emailPadrao = "usuario@gmail.com";
    const senhaPadrao = "senha123";
    
    // funções
    const enviar = () => {
        if(email === emailPadrao && senha === senhaPadrao) {
            setMensagem('Login bem-sucedido!')
        } else { 
            click++
            // função para mostrar um pedaço de cada credencial com base na tentativa de login
            setDicas(`Dicas: 
                ${emailPadrao.slice(0, click).padEnd(emailPadrao.length, '*')} / 
                ${senhaPadrao.slice(0, click).padEnd(senhaPadrao.length, '*')}
            `);
            setMensagem(`Os dados informados não conferem.`)
        }
    }
    
    if (mensagem.includes("Login")) {
        return (
            <div>
                <h2>SUCESSO!</h2><br/>
                <Video id='video' width="auto" height="700px" src="/assets/sucesso!.mp4" controls type="video/mp4" />
                <p>volume!!!</p>
                <Button type='button' onClick={() => setMensagem('')}>Deslogar</Button>
            </div>
        )
    } else {
        return (
            <div>
                <h2>{ mensagem }</h2>
                <p style={{display: "hidden"}}>{ dicas }</p>
                <Form>
                    <Inputs>
                        <Label>Email:<Input value={email} type="text" onChange={(e) => setEmail(e.target.value)}/></Label>
                        <Label>Senha:<Input value={senha} type="text" onChange={(e) => setSenha(e.target.value)} /></Label>
                    </Inputs>
                    <Button type="button" onClick={enviar}>Entrar</Button>
                </Form>
            </div>
        )
    }
};
