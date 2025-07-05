# 🎵 Projeto Java: GuilhermeFy Music & Podcast Manager

Este é um sistema simples em Java para gerenciar mídias de áudio, como músicas e podcasts. Ele permite registrar, avaliar, calcular médias de avaliações e exibir informações detalhadas de cada item, além de selecionar favoritos com base em critérios personalizados.

## 📁 Estrutura do Projeto

O projeto está dividido em classes com responsabilidades bem definidas:

### 📦 Principais Classes

| Classe         | Responsabilidade                                                                 |
|----------------|-----------------------------------------------------------------------------------|
| `Main.java`    | Ponto de entrada da aplicação. Cria instâncias e simula o uso das funcionalidades da aplicação. |
| `Audio.java`   | Superclasse abstrata para mídias de áudio, contendo atributos como título e duração. |
| `Musics.java`  | Subclasse de `Audio` representando músicas, com autor, álbum e sobrescrita do método `description()`. |
| `Podcast.java` | Subclasse de `Audio` representando podcasts, com apresentador, descrição e sobrescrita de `description()`. |
| `MyFavorites.java` | Classe que identifica e recomenda mídias favoritas com base na avaliação e número de reproduções. |

---

## ✅ Funcionalidades

- ✅ Cadastro de músicas e podcasts
- ✅ Registro de avaliações (nota)
- ✅ Cálculo de média de avaliações
- ✅ Exibição da ficha técnica (título, autor, apresentador, duração, média, etc.)
- ✅ Detecção de favoritos baseada em critérios simples

---

## 🚀 Como executar

1. Clone o repositório ou copie os arquivos `.java` para seu projeto Java.
2. Compile todos os arquivos:
3. Execute o método main.
---
✍️ Mais um projeto desenvolvido por mim para fins educacionais e práticos no aprendizado de Programação Orientada a Objetos com Java.
