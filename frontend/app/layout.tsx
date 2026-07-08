import type { Metadata } from "next";
import React from "react";
import Providers from "@/components/providers";

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
        <Providers>{children}</Providers>
      </body>
    </html>
  );
}
