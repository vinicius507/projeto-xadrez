#!/usr/bin/env python

from os import listdir
from os.path import isfile, join

path = r'/home/vinicius/UFPB/LP1/projeto/imagens/'

onlyfiles = [f for f in listdir(path) if isfile(join(path, f)) and '.py' not in f]

str = ''
i=0
for f in onlyfiles:
    # str += f"private static final Icon {f.upper().split('.')[0]} = new ImageIcon(\"imagens/{f}\");\n"
    
    # seed = f.split('.')[0].split('_')
    # camelCase = seed[0][0].upper() + seed[0][1:] + seed[1][0].upper() + seed[1][1:]
    # str += """
    # public void desenhar%s() {
    #     setIcon(%s);
    # }
    # """ % (camelCase, f.split('.')[0].upper())

    # str += f"public static final int {f.split('.')[0].upper()} = {i};\n"
    # i+=1

    # str += f"""
    #                     case Peca.{f.split('.')[0].upper()}:
    #                         casaGUI.desenhar{camelCase}();
    #                         break;
    # """
    
    if "peao" in f.lower():
        row = [1,6]
        for n in range(8):
            str += f"""
        Casa casa{i+1} = tabuleiro.getCasa({n}, {row["PRETO" in f.upper() or "PRETA" in f.upper()]});
        Peca peca{i+1} = new Peca(casa{i+1}, Peca.{f.split('.')[0].upper()});
            """
            i+=1
    if "bispo" in f.lower():
        row = [0,7]
        columns = [2,5]
        for c in columns:
            str += f"""
        Casa casa{i+1} = tabuleiro.getCasa({c}, {row["PRETO" in f.upper() or "PRETA" in f.upper()]});
        Peca peca{i+1} = new Peca(casa{i+1}, Peca.{f.split('.')[0].upper()});
                """
            i+=1
    if "torre" in f.lower():
        row = [0,7]
        columns = [0,7]
        for c in columns:
            str += f"""
        Casa casa{i+1} = tabuleiro.getCasa({c}, {row["PRETO" in f.upper() or "PRETA" in f.upper()]});
        Peca peca{i+1} = new Peca(casa{i+1}, Peca.{f.split('.')[0].upper()});
                """
            i+=1
    if "cavalo" in f.lower():
        row = [0,7]
        columns = [1,6]
        for c in columns:
            str += f"""
        Casa casa{i+1} = tabuleiro.getCasa({c}, {row["PRETO" in f.upper() or "PRETA" in f.upper()]});
        Peca peca{i+1} = new Peca(casa{i+1}, Peca.{f.split('.')[0].upper()});
                """
            i+=1
    if "rei" in f.lower():
        row = [0,7]
        str += f"""
        Casa casa{i+1} = tabuleiro.getCasa(4, {row["PRETO" in f.upper() or "PRETA" in f.upper()]});
        Peca peca{i+1} = new Peca(casa{i+1}, Peca.{f.split('.')[0].upper()});
                """
        i+=1
    if "rainha" in f.lower():
        row = [0,7]
        str += f"""
        Casa casa{i+1} = tabuleiro.getCasa(3, {row["PRETO" in f.upper() or "PRETA" in f.upper()]});
        Peca peca{i+1} = new Peca(casa{i+1}, Peca.{f.split('.')[0].upper()});
                """
        i+=1


print(str)
