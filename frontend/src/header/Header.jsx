import Link from "next/link";
import Dropdown from "react-bootstrap/Dropdown";
import DropdownButton from "react-bootstrap/DropdownButton";

export default function Header() {
  return (
    <header className="w-dvw flex items-center justify-between bg-zinc-900 text-white px-16 py-4 border-b-2 border-b-amber-200">
      <h1 className="text-2xl font-bold">
        <Link href="/">SISTEMA FINANCEIRO</Link>
      </h1>
      <ul className="flex gap-6">
        <DropdownButton id="dropdown-basic-button" title="Bancos">
          <Dropdown.Item href="/">Action</Dropdown.Item>
          <Dropdown.Item href="/">Another action</Dropdown.Item>
          <Dropdown.Item href="/">Something else</Dropdown.Item>
        </DropdownButton>

        <li>
          <Link href="/banco">Bancos</Link>
        </li>
        <li>
          <Link href="/parceiro">Parceiros</Link>
        </li>
        <li>
          <Link href="/movimento">Movimentos</Link>
        </li>
        <li>
          <Link href="/documento">Documentos</Link>
        </li>
      </ul>
    </header>
  );
}
