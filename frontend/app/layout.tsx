import type { Metadata } from "next";
import React from "react";
import Providers from "@/components/providers";
import Link from "next/link";

export const metadata: Metadata = {
  title: "My Next.js App with TS",
  description: "Sử dụng TanStack Query và TypeScript",
};

interface RootLayoutProps {
  children: React.ReactNode;
}

export default function RootLayout({ children }: RootLayoutProps) {
  return (
    <html lang="en">
      <body>
        <Providers>
          <nav
            style={{
              padding: "10px",
              background: "#eee",
              marginBottom: "20px",
            }}
          >
            <Link href="/" style={{ marginRight: "15px" }}>
              Trang chủ
            </Link>
          </nav>

          {children}
        </Providers>
      </body>
    </html>
  );
}
