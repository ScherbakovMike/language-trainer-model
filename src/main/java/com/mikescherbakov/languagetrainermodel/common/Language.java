package com.mikescherbakov.languagetrainermodel.common;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Language {
  RU("Russian"),
  EN("English");

  private final String fullName;
}
