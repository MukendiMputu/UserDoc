package info.scce.cinco.product.userdocumentation.codegen


class SVGGenerator extends UserDocFileTemplate {
	
	override fileName() {
		'''hero.svg'''
	}
	
	override fileTemplate() {
		'''
		<?xml version="1.0" encoding="UTF-8" standalone="no"?>
		<svg
		   version="1.1"
		   id="svg2"
		   width="512"
		   height="512"
		   viewBox="0 0 512 512"
		   xmlns:xlink="http://www.w3.org/1999/xlink"
		   xmlns="http://www.w3.org/2000/svg"
		   xmlns:svg="http://www.w3.org/2000/svg">
		  <defs
		     id="defs6" />
		  <g
		     id="g8">
		    <image
		       width="512"
		       height="512"
		       preserveAspectRatio="none"
		       xlink:href="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAgAAAAIACAYAAAD0eNT6AAAABHNCSVQICAgIfAhkiAAAIABJREFU
		eJzt3XmYXHWd7/FPVe9Lkk7SnU7SSbo7CyAgiyhECIFhUxE0ICACsg0+oqPj9eo8o47z3Jnn3jsz
		4DqPo864wBUFBVmVAcFEJASUHUKALJ10Z0+6O73vXVXn/oEdAqS7T9U51Wf5vl9/+Dxq1elfajm/
		d51TdX4JAYicmnWrHcmRE/A4En/5z7YV5yQCHgqALPGmBSKket3vg57zJ9S+4lz2KUBE8GYFIqB6
		3aNOdN6ujtpXnBeVwQJmJYMeAAA3ojSfRmmsgF28U4GQC/th//FwOgAIN96gQIhFdfIfQwQA4cUp
		AAAADCIAAAAwiAAAQqpm3aORPvwvxePfAMQVAQCEVhxOn8fh3wDEEwEAhFQcPjrH4d8AxBUBAACA
		QQQAAAAGEQAAABhEAAAAYBABAACAQQQAAAAGEQAAABhEAAAAYBABAACAQQQAAAAGEQAAABhEAAAA
		YBABAACAQQQAAAAGEQAAABhEAAAAYBABAACAQYVBDyDfnLNXOkGP4XASa9Ymgh4DAIQB++lgxPYI
		gHP2SiesLyopvC94AJhKYd4Xhn0e8SqWARCVJyzuLy4AGE+U9n9RGWe2YhcAcX2iAADBiePcEqsA
		iOoTFNVxA0AuorrPi+q4xxOrAIiyuL2wAOBw2NeFBwEAAIBBsQkAqhIAkG9xmmtiEwAAAMA9AgAA
		AIMIAAAADCIAAAAwiAAAwioOVyGPw78BiCkCAAip9tPOjfz0GYd/AxBXBAAAAAYRAAAAGEQAACHW
		viK6h9CjPHbAAgIAAACDCAAg5KL4STqKYwasIQCACIjShBqlsQKWFQY9AADujE2s1etWO1LY1iNJ
		qH3FOUz8QIQQAEDE5DrRXvLMWqchWTTuYb+MpJbMqO4+eSUTOWAAAQAYcP/LL7o6ZLBCpbrq5Red
		VcefSAQAMUcAhJDbnXVUMJkA2WM/gHyLzRPinL0y8m+WllNP08uXXBb0MPKKncDUy3Ui4bmaenGb
		9N/u+LvvUsNTTwY9DM8Sa9bG4r3BEYAQ6ZszJ+gh5N3YDo7JBXhT3Cf+MRb2cVHCzwARCCs7PGAy
		vBcQFAIAgWHHB+t4DyBIBAACxQ4wv7w8vjw3+cXji6ARAAgcO0JYw2seYUAAIBTYIcIKXusICwIA
		AACDCACEBp+MEHe8xhEmBAAAAAYRAAAAGEQAhEmGo4McIkVc8doW+7iQIQBCpP7pPwc9BADIG/Zx
		4cJaACEy/Y67ErrjroP/nU8MAKLu7et+xGHhtrggAEIsygvmEC+Af6K8L0B4cQoAAACDCAAAAAwi
		AAAAMCg2AZBYs5ZzZACAvIrTXBObAAAAAO7FKgCiXGZRHjsAuBXlfV2Ux344sQqAqIrbiwoAJsI+
		LxxiFwBRe2FFbbwA4Ieo7fuiNl43YhcA0htPVBSerCiMEQDyJQr7wKjMJ7mI9ZUAx560sF16Mq4v
		JgDIFvvp4MQ6AMZYeCIBIMrYT0+9WJ4CAAAAEyMAAAAwiAAAAMAgAgAAAIMIAAAADCIAAAAwiAAA
		AMAgAgAAAIMIAAAADCIAAAAwiAAAAMAgAgAAAIMIAAAADCIAAAAwiAAAAMAgAgAAAIMIAAAADCIA
		AAAwiAAAAMAgAgAAAIMIAAAADCIAAAAwiAAAAMAgAgAAAIMIAAAADCIAAAAwiAAAAMAgAgAAAIMI
		AAAADCIAAAAwiAAAAMAgAgAAAIMIAAAADCIAAAAwiAAAAMAgAgAAAIMIAAAADCIAAAAwiAAAAMCg
		RNADgDv/vrrZGRl1lMkEPRJ3SovTSiacnO47OFIgx+Gl6YeiwoyKCnJ70YymkxpN8RnBD4mEo7Li
		dE73zTgJDY0U+Dyi/EgmpeKihL5wTiNv4AjgSQqxr/yqydmxXxoY4mkCEC3lpY4W1Ur/dvlSdmAh
		xRMTQv9071ZnfZOUye0DNACERjIhHbdU+qeLlzDfhAxPSMjc8J9NTns3TwuAeKme4egnN3I0IEx4
		MkLimw9vc57aEJ1z/ACQrWRSOvXYhL78ocXMPSHAN3xC4tnXM0z+AGItk3ljX4dwIABC4PO3NjnD
		owQxgPgbHk3o87c28Q2nECAAAnbTf29zdrYy+QOwY2drQjf99zYiIGAEQMCe38jhMAD2sO8LHgEQ
		oJsf2uaMpPj0D8CekVRCNz/EUYAgEQAB2ttOAQOwi31gsAiAAHX2Bj0CAAgO+8BgEQABGhgKegQA
		EBz2gcEiAALE+X8AlrEPDBYBAACAQQQAAAAGEQAAcIjRwrT6KkaUSebnG+o1qT4tHOlS0vH/F3AF
		CUeLSttUXdzj+7YRP4VBDwAAgjZcktb2+g51TxvScOmoJCnhJFQ2WKSqrlLV75ilgnTun5eOHm7V
		xV0b1DjSocr0sCRpJFGg7cUz9cfKJVo9bWnO207I0bnVL+qMqldVX9qmomRKktSTLlPzwFzd03qq
		NvXX5bx9xBcBgMMqLEzoxCPKtGhukRbWFmt2VaES4podyL+Mk1Bb56h27h9R854Rrd8ypDx8WD6o
		dU6vtjUeUKrwrZ/4nYSjgfIRDZSP6MDsAS1rqlFVV1lW2y5xUvpE50v6YO8mJd72byh20lo23K5l
		w+1aPrBD/zn7FLUXVmS1/TnFXfrMgod1dOXOd/x/0wsGdfy0Zh03rUUPtr1Pd+5fodEMu3y8ia9g
		BmjVTVtDOaMumluky8+bqTmz2FkgeNv3jujOR7vU2pnyfdv75vaoaUm7q9smnITe/co8Te8tdb39
		L7Wu1ckD75ycD6e9sEJfnn+BBpPu3ncVySF968hbNLOoz9Xt13Uere/tvMDVbafS/X+/hHkoIHwH
		AG9x8jHl+tzHa5j8ERr184r1xStrdGR9ia/bHSpJqbnhgOvbOwlHW5a1KZN01+2n9be4nvwlqTrV
		r6s6n3d9+2sWrHE9+UvSipmv6eTpW1zfHvFHAOCg6qpCrTpzhpL0OEKmqDChj583U+Wl/r04mxsP
		KF2Q3UG4wbJR7Z7fPentipyMru94LusxndPbpCUjk0fJURW7dEbVq1lv/4a6R5UUl9/FGwgAHHT5
		eVUqLmL2RzhNr0hq1ZlVvm2ve8ZgTvfrqhqY9DaLRroOftkvW0cP7Z/8NhXujywcakZRv+pKO3K6
		L+KHAIAkaUZlgRrmFwc9DGBCxy0tVdKHQ1TDJal3fOnPrb7KYTlv/0bf2zSO5D7JNg53Tn6b8n05
		b39x6eSBARsIAEiSFtQy+SP8CgsTmjvb+/dTBspHcr5vusDRcEl6wtssHJ18Eh/3viNdk95mUYm7
		Ly4edvtlbTnfF/FCAECSVFfDl/4QDfNrijxvI5HxdhQhOcn9U4mCnLedSky+Wx51PGzfw30RLwQA
		JEl9g3wxCNHQ78NrtbI/918UFI0UqHhk4km0uWhmzttvLpk16W1aBmtz376H+yJeCABIkna3jgY9
		BMCV3a25H74fU5hKqmQ4t6Ne01zEg5tJfDwtxZPf18sk3jw4J+f7Il4IAEiS9raPKpMJ5XWJgIN6
		+jPq6ffnaNXsA+W53a998qv17Smarj1FM7Le9miiQC+VzZv0di/2NeZ0KH/7UI1aR/z7JQWijQCA
		JGlk1NHqZ9xfVAQIwsNP+rfITf2O2SoZyu77BFXdZaptnTbp7Rwl9IPq5coksvuuwZ0zj1NrYeWk
		t9szNFv37D81q22nnaR+uPPDWd0H8UYA4KDVz/RxKgCh9dq2IT372uS/wXerIJ3QEU01cnlhPxWl
		CrRsS43r7W8pqdb9M45xffvXSmv14PR3ub79A23LtWVgvuvb/3r/aRz+x1sQADgok3H0swc7tGMf
		EYBweb1lSHf+fvKfx2VrRnepTnhpgSomOa8/s7NMJ75Yl/X3Bu6sOl7/XrNCvcnxf2abVkL3Vh2r
		/1t7lpwslmdJOwn989ZP6DetJyszwa68J1Wub29fpfta35/V2BF/XPYtQGFdDCiZkM48qVLnnDKN
		KwMiUANDjh58olvPvOrfJ//DySSk/bU96pk+qL5pIxouTql0qEiVfSWa2VmmmvbJD8tPZEZ6SB/o
		3aTFIx1aPNyhYielluJZai6epbWVjWp28cW/iSwt36vTq15TQ9l+NZS1aihdrObBWjUNztWjB05U
		Tyq37ztMBRYDCg4PfIDCGgBjksk3LrqycG6RZk8v5NWCKeE4UltHSjv2j6itIxXLRagTjuTk6f2U
		kJPVkYSgEQDB4eovGFcm42hP26j2tHFKAPBTviZ/SZGa/BEsvgMAAIBBBAAAAAYRAAAAGEQAAABg
		EAEAAIBBBAAAAAYRAAAAGEQAAABgEAEAAIBBBAAAAAYRAAAAGEQAAABgEAEAAIBBBAAAAAaxHHCA
		Ljq9L+ghAECg7g96AIYRAAGaUZEJeggAAKM4BQAAgEEEAAAABhEAAAAYRAAAAGAQAQAAgEEEAAAA
		BhEAAAAYRAAAAGAQAQAAgEEEAAAABhEAAAAYRAAAAGAQAQAAgEGsBhigqhkzgh4CAMAoAiBAC+bN
		C3oIAACjOAUAAIBBBAAAAAYRAAAAGEQAAABgEAEAAIBBBAAAAAYRAAAAGEQAAABgEAEAAIBBBAAA
		AAYRAAAAGEQAAABgEAEAAIBBBAAAAAYRAAAAGEQAAABgEAEAAIBBBAAAAAYRAAAAGEQAAABgEAEA
		AIBBBAAAAAYRAAAAGEQAAABgEAEAAIBBBAAAAAYRAAAAGEQAAABgEAEAAIBBBAAAAAYRAAAAGEQA
		AABgEAEAAIBBBAAAAAYRAAAAGEQAAABgEAEAAIBBBAAAAAYRAAAAGEQAAABgEAEAAIBBBAAAAAYR
		AAAAGEQAAABgEAEAAIBBBAAAAAYRAAAAGEQAAABgEAEAAIBBBAAAAAYRAAAAGEQAAABgUGHQAwD8
		kko5atk1oG07B1U1vVBL6ys0q6oo6GEhwjq6RtW0vV9dPSktXlimhgXlKixMBD0swBcEACKvtz+l
		H/5iux5/ukOptPOW/29OdYk+e+Uivf89MwMaHaLoTy906ge371Br+/Bb/vfCgoTOOGWWPnNVvaZV
		sPtEtJGyAWoaHnQmvxUm8vRLXfrOLc3q7B6d8HZnnzpbn7u6QeVlBVM0MkTRwGBa/3Fbi9Y8dWDC
		282cUaQvXt+oU06omqKRxdfSkjLmoYDwwAeIAPDmkbVt+s4tzXJcPopnnDJLX/vs0vwOCpH2Lz9o
		0uNPd7i6bSIhffH6Rn1gZU2eRxVvBEBw+BIgIinbyV+SHn+6Q08+15m/QSHSnnyu0/XkL0mOI33n
		lmY9srYtj6MC8oeTWIicXCb/Md//+Xad9t74fR/gqec79dwr3TrQNaL2zlHV1ZbolBNm6n3HzdD0
		St7mbnz/59uzvs9YBEjiSAAihz0DIsXL5C9JB7pGtLdtWPNqSvwdWEBe2dSrn9y5Uxu39r3lf29q
		6dfjT3eosCChz13ToA+dweQ0kdb2YR3oGsnpvkQAoopTAIgMr5P/mM3b+v0ZUMDWb+zRV27a+I7J
		/1CptKPv3tKsH/1yh+fHLc62bB/wdH9OByCKCABEgl+TvyR15PhJL0z2tg3rf3+v6R0/exzPPb/b
		p9+u2Z/nUUXXZL8icYMIQNQQAAg9Pyd/SVpSX+7PhgLiONK/fL9JPX2prO53+wN7NDiUztOooq1x
		oT+vCSIAUUIAINT8nvwTCWlZQ4U/GwvI2mc6tLk5+9MYXT2j+u2a1jyMKPoWLyxTwqcfoxEBiAoC
		AKHl9+QvSctPmKmy0uheDCiddvT/7tmV8/237fR2rjuuykoLtPwE/34dMhYBjz5BBCC8CACEUj4m
		/8ryAn3+2nr/NhiA3z3epj37h3K+vx/nuuPq89fWq7Lcvzh0HOnbP+VIAMKLAEDo5GPyl6Qbr6zX
		7Kpifzc6hYZHMvrFA7s9baN/gO8AjGd2VbFuvNLfQOR0AMKMAECo5Gvyv/7ShTp3RbW/G51i9z26
		Tx1d3j7BH3vENJ9GE0/nrqjW9Zcu9HWbRADCigBAaORz8v/4BfP83egU6+1P6a4H93reDovXTO7j
		F8wjAmACAYBQYPKf2K9+u1f9g94O38+YVqh3H8URADeIAFhAACBw+Zr8r7t0QSwm//aOEf1mtfeL
		+HziI/NVWMDCa24RAYg7AgCByufkf/kF8/3daEB+fv9ujYxmPG2jtrpEF55V69OI7CACEGcEAALD
		5D+5nXuH9OgT7Z63c/XFdSos5NN/LogAxBUBgEAw+btz6907lcl4e5AaF5Tr7FOj/QuIoBEBiCMC
		AFMuX5P/tZfEa/LfuLVPTz7X6Xk71126wLfL3FpGBCBuCABMqXxO/p+4MD6TvyT99K7cL/k75tgj
		pvHTPx8RAYgTAgBThsnfvede6db6jT2et3P9Zf5OViACEB8EAKZE3ib/j8Vv8ncc6dZf7/S8neUn
		VumYZZU+jAhvRwQgDggA5F1eJ/+PxGvyl6Q/Pn1ATdu9rdqXSEjXXcKn/3wiAhB1BADyisk/O6m0
		o595WO53zNmnVqthQZkPI8JEiABEGQGAvGHyz97Df2zT3tZhT9soLEzomovrfBoRJkMEIKoIAORF
		vib/a2I8+Q8NZ3S7x+V+JenCs2o1p7rEhxHBLSIAUUQAwHf5nPyviOnkL0n3PbJPnd3elvstKy2I
		bSCFHRGAqCEA4Csm/9z09KV010Pel/u99ENzNWNaoQ8jQi6IAEQJAQDfMPnn7le/3aMBj8v9Vk0v
		0sUfnOvTiJArIgBRQQDAF/ma/K++OP6Tf5tPy/1e8ZH5Kist8GFE8IoIQBQQAPAsn5P/lR+N9+Qv
		Sbfdu1ujKW8P3tyaEn34r+b4NCL4gQhA2BEA8ITJ35sduwe1+kk/lvtdwHK/IUQEIMwIAOQsb5P/
		RXUmJn9JuvWeXd6X+11YrrPeP9unEcFvRADCigBATvI6+a+ycRGb17f26annvS/3ez3L/YYeEYAw
		IgCQtRc2dDP5++CWu7wv+PPuI6fp5ONZ7jcK8hkBL2zo9nW7sIEAQFYGh9L6zq0tTP4ePbu+W+s3
		9nrezl+z3G+k5C0Cbm3R4JC3n5HCHgIAWbn17l1qbfd2rfq3+6Sxyd9xpFt8WO73/e+ZqXctZbnf
		qMlHBLS2D+vWu70vIgVbCABkZd2z3s9ZH+qTF9XpKkOTvyQ99ucD2rbD+3K/11+ywKcRYarlIwL8
		fm8i/ggAuNbVM6oDXSO+bc/i5J9KO7rNh+V+z11RrUV1LPcbZX5HwIGuEXX1eFtLArYQAHCtZdeg
		b9s67/Qac5O/JD30WKv2tnk7hVJUmNAnL+LTfxx8/IJ5uuAs/y7g5Od7FPFHAMC16lnFvm3riWc7
		tGGz9y/BRcngUFq3P7DH83YuPLtWc2b791wgOBu39umxPx3wbXt+vkcRfwQAXKurLfXtWvODQ2l9
		/VubTUXAvY/s93yItryM5X7jYuPWPn31G5vU73ERqDFlpQWqqy31ZVuwgQCAa4mEdMwy/751bikC
		untTuvthH5b7PX+epley3G/UjU3+XleAPNQxyyq5IBSyQgAgK5++YpGKfLzmvJUI+KUPy/3OnFGk
		iz/Acr9Rl4/Jv6gwoU9fsci37cEGAgBZWTS/TFdd5O+X9+IeAa3tw3pwjT/L/ZaW8JaNstfzMPlL
		0lUX1WnRfH4VguywN0HWLjt/nk5/3yxftxnnCLjtPu/L/c6rKdH5LPcbaa9v7dPX8jD5n/6+Wbrs
		/Hm+bhM2EADIWjKZ0Fc/s4QIcGG7T8v9XvOxBSos4ARvVOVz8v/qZ5YomeS1gewRAMhJQQER4Mat
		v97led2EJYvKdeZylvuNqnxP/gWEIXJEACBnRMDEXtvSpz+96MNyv5ct5NvdEcXkjzAjAOAJETC+
		n/qw4M9xR03Xe989w4fRYKox+SPsCAB4RgS80zMvd2nDJj+W++WSv1H0ehOTP8KPAIAviIA3OY50
		y13eF/w57aSZOmoJy/1GzetNffraN5n8EX4EAHxDBLzhD0+1q3mXt+V+k8mErmW538h5vSk/v/Nn
		8kc+EADwlfUISKUc/eze3Z63c+6Kai7sEjFjk//gEJM/ooEAgO8sR8CDj7Vqf7u35X6Li5K62uer
		LSK/mPwRRQQA8sJiBAwOpXXHA94//V94zhyWdY2Q17Yw+SOaCADkjbUIuOd3+9Tdm/K0jYqyAn3i
		Qpb7jYrXtrzxhT8mf0QRAYC8shIBbyz3u8/zdi798DxNq2C53yhg8kfUEQDIOwsRcMcDuz1PBCz3
		Gx1M/ogDAgBTIs4RsL99WA8+1up5O1etqlNJMW/JsGPyR1ywt8GUiWsE/Oze3Up5XO53fm2pPnhG
		jU8jQr68yuSPGCEAMKXiFgHNuwb0h6d8WO734jqW+w25V7f06R+Y/BEjBACmXJwiwI/lfpc2VOiM
		U1juN8yY/BFHBAACEYcI2LC5V0+/1OV5O9dfuoDlfkOMyR9xRQAgMFGPgFvu8r7c7wlHT9dJx07d
		cr/dPSm9sKFbm7b1a3Q0k5e/MTCY1vqNPXplU68Gfb4m/piR0Yw2be3X8692q8fjtRcmwuSPOOMH
		xwjUWARI0hPPdvi23bEI+D9fOkLHHjHNt+2O+fOLXXp1S5/n7Vx/6UIfRjOxkdGMfnHfbv3hTwfU
		1jFy8H8vKEiocWGZrvnYAp18XJWnv+E40gOr9+k3v2/Vntahg6dFEgmprrZUq86r1YVn13r6G5L0
		xHOduuP+3WrZM6hM+s1zL3NmF+vcFdW68qN1vk2qTP6IO16BAWoaHvR49jg+0mlH//rDrb5GgCSV
		lRb4HgGOI9349VfUsmvQ03ZWvHeW/vHzS30a1eFt2tavb/x4m3bumXisH1hZoxuvWKTysoKs/8b+
		A8P61o+b9fLrPRPe7qRjZuhLn2rU7JnZX+a4byCt79/Woj/86cCEt1uyqFx/9+nFalxQnvXfONSG
		zb36+rc2M/lPgaUlZTwYAeEUAEIhSqcDVj/Z7nnyTyYTui7Py/22dYzoq9/YNOnkL0mPrG3Tt36y
		Leu/MTqa0T98c/Okk78kPf9qt/7x25uVTmffvTf9cOukk78kbd0xoK/820ZPpwWY/GEFAYDQyHcE
		NLX0e97WaMrRbfd5X/DnA6dXa8G8Us/bmci3f9qs/gH3E+G65zr12J8nn2QPddu9u10FxpitOwZ0
		x2/2ZPU3HlnbpmfWu/+yZVdvSt+7rSWrvzGmqaWfyR9mEAAIlXxGwM0/2ub5gj0PrtmvVo/L/ZYU
		J3VVnpf7ffqlTr2woTvr+/3gF9uVcfkQ7W8b1j2/y379gzt+u0cHOkcmv6GkVMrRf/0y+y9brn2m
		Qxs2ZnfUJ5VydPOPtjH5wwwCAKGTrwjYvntQt3tYrjeddvSrB/d6HsdHzqlVdQ7nwbPx6ubcvqDY
		05vSrn3uPtFv2NKntNtaOEQm7ej1JndHY5p3DWZ1FONQ67M87XP7A7u1fbe3Uztvx+SPMCMAEEr5
		ioC7H96nVA7noCXp1S296uoZ9fT3K8sLdPkF8zxtw40tLQO537fZ3X03b8v9lMqmbe4CZePW3L+7
		sSmL8aXTji+rOR6KyR9hRwAgtPIRASOjmZy/wPfUC94v+nPZh+ercgqW+92exXn5t9u51919t+/O
		PTLcftLevnso739DknbsHdSIj9dFYPJHFBAACLV8RMCW5tw+ubr91Dqe2VXFWnWe99/Cu1FRnv3P
		+Q7et8xdoHj6Gy7v6+1vuN+9NXk4YvJ2TP6ICgIAoZev0wHZqppe5On+V66aP2XL/S6tz/138Esb
		3N13WWNlzn9j2WJ39z3S5e0Oe18P48sVkz+ihABAJPgZAcsaK3K6n5cv7tXVluqDK6duud8jGnKf
		/JbWu3t8jlqS2+MoSUc2uPwbiz38jSyeZ7fRMxEmf0QNAYDI8CMCiouSalhQltN9j16a+6R67SUL
		pnRiOPW9VSotzf7w+fITqjStwt39jl5aqbra7K9lsKiuTEe6nNhnVRXpPcdkv1bCtMpCnfKeme7H
		NK9MxUW57w6Z/BFFBAAixWsEXPKhuSrMcSd95vLZOV1i9sjFFVN++qJ2doluuCy7Kw1OqyjQF65r
		dH374qKkvnTDYiWzeDgLkgl9+YbFKix0f6cv/nWjyrK8RPHffLJeVdPcf9myoCChSz40N6u/MYbJ
		H1FFACByco2A+royXfnR3C/Ak0hI12c5qZaVFugrNy4JZLnfC86q1Yr3uvsUXFiY0BeubdSsquy+
		53DMEZW6YpW7xzSRkK7+2ALXn/7HzJldrL+9ukFJlxPseadX66+Wz87qb0jSlR+tU31ddkeHmPwR
		ZbxqA8RiQN6k047+47bteuiPrZPetmZWsf75i0doySLv53pXP9mu797SrNFJripYVlqgr312iU4+
		3ttKe1499FirfnTnznGX5l3aUK6/+9RiNXhYQOfZ9V369k+b1dF1+Osk1Mwq1v+8oTGnw/ljmloG
		dPOPto77877K8gJ95sp6nbOiOue/sXXHgP7Xdza/ZdXE8Zx/5hx97up6Jn+PWAwoODzwASIA/PH8
		hm5999aWcS/Re/6Zc/SpyxfmtNLdeF7f2qeb/2ub9uw//O/Uj1xcoS9/arEWzc/t+wZ+a+sY0dMv
		dmpLy4C2bO/XtPJCLWss15GNlTrtpJmuP11PpLc/rSef73jjb7T0qSCZ0NL6Ci2tL9fp75vly+M/
		OprRuuc7taW5X1taBjQwlDr4N047aVbWRzAOZ2AwrR//aue4YTmnukT/47oGnXRs7jGDNxEAweGB
		DxAB4J+h4Yw2bO7VlpZ+Ne8cUNX0Ii2tL9dRSyrzOgm3tg9r/aZerd/Yq5HRjOZWl+iUE6r0Lg9f
		GEQ47NgzqI1b+9S0fUBdPaNqXFiuZQ0VOvaIaSot4eypXwiA4PDAB4gAAGAdARAcMhYAAIMIAAAA
		DCIAAAAwiAAAAMAgAgAAAIMIAAAADCIAAAAwiAAAAMAgAgAAAIMIAACFkj2nAAAGSUlEQVQADCIA
		AAAwiAAAAMAgAgAAAIMIAAAADCIAAAAwiAAAAMAgAgAAAIMIAAAADCIAAAAwiAAAAMAgAgAAAIMI
		AAAADCIAAAAwiAAAAMAgAgAAAIMIAAAADCIAAAAwiAAAAMAgAgAAAIMIAAAADCIAAAAwiAAAAMAg
		AgAAAIMIAAAADCIAAAAwiAAAAMAgAgAAAIMIAAAADCIAAAAwiAAAAMAgAgAAAIMIAAAADCIAAAAw
		iAAAAMAgAgAAAIMIAAAADCIAAAAwiAAAAMAgAgAAAIMIAAAADCIAAAAwiAAAAMAgAgAAAIMIAAAA
		DCIAAAAwiAAAAMAgAgAAAIMIAAAADCIAAAAwiAAAAMAgAgAAAIMIAAAADCIAAAAwiAAAAMAgAgAA
		AIMIAAAADCIAAAAwiAAAAMAgAgAAAIMIAAAADEoEPQDrmoYHnaDHAABBWFpSxhwUIB78ECACAFjD
		5B88noCQIAIAWMHkHw48CciLtTtaHCeTyem+ZzQs5nXpkz/v3e0MDw/ndN+SkhItn1fHc+GTx1u2
		5RT5iWRSKxc18DzAd4VBDwDx1NHZGfQQIGlfa2vQQ8BfdHZ3Bz0E4C34FQAAAAYRAAAAGEQAAABg
		EAEAAIBBBAAAAAYRAAAAGEQAAABgEAEAAIBBBAAAAAYRAAAAGEQAAABgEAEAAIBBBAAAAAYRAAAA
		GEQAAABgEAEAAIBBBAAAAAYRAAAAGEQAAABgEAEAAIBBBAAAAAYRAAAAGEQAAABgEAEAAIBBBAAA
		AAYRAAAAGEQAAABgEAEAAIBBBAAAAAYRAAAAGEQAAABgEAEAAIBBBAAAAAYRAAAAGEQAAABgEAEA
		AIBBBAAAAAYRAAAAGEQAAABgUGHQA5gKztkrnaDHcKjEmrWJoMcAAGHCfnrqxToAwvaCGjM2Lgsv
		MACYCPvp4MTyFIBz9konrC+qQ0VhjACQL1HYB0ZlPslF7AIgak9U1MYLAH6I2r4vauN1I3YBEEVx
		fGEBwHjY54VDrAIgyi+qKI8dANyK8r4uymM/nFgFAAAAcCc2ARC3MgMAhE+c5prYBAAAAHCPAAAA
		wCACAAAAg2J9JcCou//lF2NzrglA7qK8L1h1/ImxvZJe1BEAIdJzxWXOH/7+q0EPAwB8c2i8nHXT
		v0r79wU5HByCUwAhsv2U5UEPAQDyhn1cuBAAYZLkSBmHCxFXvLbFPi5kCAAAAAwiAAAAMIgAQGhw
		iBRxx2scYUIAAABgEAGAUOCTEazgtY6wIAAQOHaIsIbXPMKAAECg2BHml5fHl+cmv3h8ETQCAIFh
		BwjreA8gSAQAAsGOD3gD7wUEhbUAQqSytTXoIeQdOzvgncbeF1Fe9McNC/u4KInNztg5e2Xk3ziJ
		NWtjuRNg0g9etq8pnrPgxXU/EKd9ddRxBCCE2PkCYD+AfCMAAANWHX9i4pJn1joNyaJxv/iTkdSS
		GdXdJ69k4gEMIACAiKlet9qRsj+K+seRYUnDLrb/+xwO0SbUvuIcwgGIEAIAiIg3J+YwnkJ1Do6v
		fcW5hAAQAfwMEIiA3D6VByNKYwUsIwCAkIvihBrFMQPWEAAAABhEAAAhFuVP0lEeO2ABAQAAgEEE
		AAAABhEAQEhVPxn9Q+hx+DcAcUUAAGEVh6kzDv8GIKYIAAAADCIAAAAwiAAAAMAgAgAAAINiEwCJ
		NWtZgAQAkFdxmmtiEwAAAMA9AiAk4lSVADAe9nXhEasAiOoLK6rjBoBcRHWfF9VxjydWASDF7wkC
		AAQvjnNL7AJAis4TlVizNhGVsQKAn6K0/4vKOLMVywCQwv/iCvPYAGCqhHlfGPZ5xKvCoAeQb3F+
		8gAgDthPByO2RwAAAMD4CAAAAAwiAAAAMIgAAADAIAIAAACDCAAAAAwiAAAAMIgAAADAIAIAAACD
		CAAAAAwiAAAAMIgAAADAIAIAAACDCAAAAAwiAAAAMIgAAADAIAIAAACDCAAgpBJBD8AHcfg3AHFF
		AACh5QQ9AB/E4d8AxBOBDoRY9brfR3oGbV9xLvsYIKQ4AgAAgEEEAAAABnF4Dgi5qJ4G4PA/EG68
		QYEIiFoEMPkD4ccpACASojT/R2msgF1UOhAhYT8SwCd/IDp4swIRVLNutSM5gX/WTvzlP9tWnMO+
		BIiY/w+9Hym48cmBmAAAAABJRU5ErkJggg==
		"
		       id="image10" />
		  </g>
		</svg>
		'''
	}
	
}