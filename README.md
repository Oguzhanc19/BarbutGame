<div align="center">
  <h1>🎲 Barbut Game (Craps)</h1>
  <p><i>Terminal-Based Java Implementation of the Classic Dice Game<br>Klasik Zar Oyununun Java ile Terminal Tabanlı Uygulaması</i></p>

  ![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
</div>

<br>

## 🇬🇧 English

A robust implementation of the popular dice game **Barbut (Craps)**, written entirely in Java. This project serves as an excellent demonstration of procedural logic, loop constructs, and random number generation within the Java ecosystem.

### 🧠 Logic & Rules Implemented
The game meticulously follows the authentic rules of Craps via the `zarAt()` method:
1. **The Come-Out Roll**: Two dice are rolled (`Math.random() * 6 + 1`).
   - If the sum is **7 or 11**, the player instantly **wins**.
   - If the sum is **2, 3, or 12**, the player instantly **loses (Craps out)**.
2. **The Point Phase**: If the sum is **4, 5, 6, 8, 9, or 10**, this becomes the player's "Point".
   - The program enters a `while` loop, rolling the dice repeatedly.
   - If the player rolls the "Point" again before rolling a 7, they **win**.
   - If a **7** is rolled before the Point, the player **loses**.

### 🚀 How to Run
```bash
javac zar.java
java zar
```

---

## 🇹🇷 Türkçe

Popüler zar oyunu **Barbut'un (Craps)** Java dili kullanılarak terminal üzerinde oynanabilen sağlam bir simülasyonudur. Bu proje, Java'daki döngü (loop) yapılarını, koşullu ifadeleri ve rastgele sayı üretimini (RNG) anlamak için harika bir örnektir.

### 🧠 Uygulanan Mantık ve Kurallar
Oyun, `zarAt()` metodu içerisinde Barbut'un gerçek kurallarını birebir uygular:
1. **İlk Atış (Come-Out Roll)**: İki zar atılır (`Math.random() * 6 + 1`).
   - Toplam **7 veya 11** gelirse, oyuncu anında **kazanır**.
   - Toplam **2, 3 veya 12** gelirse, oyuncu anında **kaybeder**.
2. **Puan Aşaması (The Point)**: Eğer toplam **4, 5, 6, 8, 9 veya 10** gelirse, bu sayı oyuncunun "Puanı" olur.
   - Program bir `while` döngüsüne girer ve zarlar tekrar tekrar atılır.
   - Oyuncu **7** atmadan önce kendi "Puanını" tekrar tutturursa **kazanır**.
   - Kendi puanını tutturamadan **7** gelirse **kaybeder**.

### 🚀 Nasıl Çalıştırılır?
```bash
javac zar.java
java zar
```
