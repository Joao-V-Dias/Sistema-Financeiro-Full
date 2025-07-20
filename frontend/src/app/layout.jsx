import "./globals.css";
import Header from "../header/Header";

export default function RootLayout({ children }) {
  return (
    <html lang="pt-br">
      <body className={`antialiased`}>
        <Header />

        {children}
      </body>
    </html>
  );
}
