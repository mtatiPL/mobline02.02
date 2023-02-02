package com.example.projekt;

public class planszowka {
   private String nazwa;
    private Integer MiniloscGraczy;
    private Integer MaxiloscGraczy;
    private  String kategoria;
    private  Integer czasGry;
    private String trudnosc;


 public planszowka(String nazwa, Integer miniloscGraczy, Integer maxiloscGraczy, String kategoria, Integer czasGry, String trudnosc) {
  this.nazwa = nazwa;
  MiniloscGraczy = miniloscGraczy;
  MaxiloscGraczy = maxiloscGraczy;
  this.kategoria = kategoria;
  this.czasGry = czasGry;
  this.trudnosc = trudnosc;
 }

 public String getNazwa() {
  return nazwa;
 }

 public void setNazwa(String nazwa) {
  this.nazwa = nazwa;
 }

 public Integer getMiniloscGraczy() {
  return MiniloscGraczy;
 }

 public void setMiniloscGraczy(Integer miniloscGraczy) {
  MiniloscGraczy = miniloscGraczy;
 }

 public Integer getMaxiloscGraczy() {
  return MaxiloscGraczy;
 }

 public void setMaxiloscGraczy(Integer maxiloscGraczy) {
  MaxiloscGraczy = maxiloscGraczy;
 }

 public String getKategoria() {
  return kategoria;
 }

 public void setKategoria(String kategoria) {
  this.kategoria = kategoria;
 }

 public Integer getCzasGry() {
  return czasGry;
 }

 public void setCzasGry(Integer czasGry) {
  this.czasGry = czasGry;
 }

 public String getTrudnosc() {
  return trudnosc;
 }

 public void setTrudnosc(String trudnosc) {
  this.trudnosc = trudnosc;
 }
}


