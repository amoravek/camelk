#!/bin/bash

ARGOCD_NS='argocd'
ARGOCD_HELM_REPO='https://argoproj.github.io/argo-helm'
ARGOCD_CHART_VERSION=5.23.1

if [ ! -z $1 ]; then
  if [ -f $1 ]; then
    VALUES_FILE="$1"
  else
    echo "ERROR: Override file does not exist ($1)"
    exit 1
  fi
fi

echo "INFO: ArgoCD will be installed into '$ARGOCD_NS' namespace with values override file '$VALUES_FILE'"
echo -n "Do you want to proceed? [y/n]: "
read ans

if [ "${ans,,}" == "y" ]; then
  if [ -z ${VALUES_FILE+x} ]; then
    helm upgrade --install argocd argo-cd \
      --repo=$ARGOCD_HELM_REPO \
      --version=$ARGOCD_CHART_VERSION \
      --namespace=$ARGOCD_NS \
      --create-namespace
  else
    helm upgrade --install argocd argo-cd \
      --repo=$ARGOCD_HELM_REPO \
      --version=$ARGOCD_CHART_VERSION \
      --namespace=$ARGOCD_NS \
      --create-namespace \
      --values="$VALUES_FILE"
  fi
else
  echo "INFO: Exit without any action"
  exit 0
fi
